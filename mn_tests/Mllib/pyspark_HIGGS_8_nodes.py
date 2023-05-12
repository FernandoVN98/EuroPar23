from pyspark.sql import SparkSession
from pyspark import SparkConf
from pyspark.context import SparkContext

from pyspark.ml import Pipeline
from pyspark.ml.classification import RandomForestClassifier
from pyspark.ml.regression import RandomForestRegressor
from pyspark.ml.feature import StringIndexer, VectorIndexer, VectorAssembler
from pyspark.sql import SparkSession
from pyspark.ml.evaluation import RegressionEvaluator
from pyspark.mllib.evaluation import MulticlassMetrics
import os
from pyspark.ml.evaluation import MulticlassClassificationEvaluator
import copy
import sys

# Initialize Spark session
spark = SparkSession.builder.master("spark://"+os.environ["MasterIP"]+":7077").appName("RandomForestClassifierExample").getOrCreate()

# Load dataset
df = spark.read.csv(sys.argv[1:], inferSchema = True)

numeric_features = [t[0] for t in df.dtypes if t[1] == 'double']
df.select(numeric_features).describe().toPandas().transpose()


numericCols = ['_c1', '_c2', '_c3', '_c4', '_c5', '_c6', '_c7', '_c8', '_c9', '_c10', '_c11', '_c12', '_c13', '_c14', '_c15', '_c16', '_c17', '_c18', '_c19', '_c20', '_c21', '_c22', '_c23', '_c24', '_c25', '_c26', '_c27', '_c28']

assembler = VectorAssembler(inputCols=numericCols, outputCol="features")
df = assembler.transform(df)

# Split data into training and test sets
(trainingData1, testData) = df.randomSplit([0.9, 0.1], seed=0)
(trainingData2, testData2) = df.randomSplit([0.9, 0.1], seed=0)
trainingData = trainingData1.union(trainingData2)
del trainingData1
del trainingData2
del testData2
# Train a RandomForest model
rf = RandomForestClassifier(labelCol='_c0', featuresCol='features', numTrees=24, maxDepth=18, maxBins=256)

# Create pipeline
pipeline = Pipeline(stages=[rf])

# Train model
model = pipeline.fit(trainingData)

# Make predictions on test data
predictions = model.transform(testData)
predictions.show()
evaluator = MulticlassClassificationEvaluator(labelCol="_c0", predictionCol="prediction")
accuracy = evaluator.evaluate(predictions)
print("Accuracy = %s" % (accuracy))
spark.stop()
