from pycompss.api.api import compss_wait_on, compss_barrier
import numpy as np
import dislib as ds
from trees.forest import RandomForestClassifier
import pandas as pd
from sklearn.model_selection import train_test_split
import time
from pycompss.api.task import task
import sys

@task()
def main(args):
    data = pd.read_csv(args)
    data = data.values
    x_train, x_test, y_train, y_test = train_test_split(data[:, 1:], data[:, 0], test_size=0.1, random_state=0)
    x_train_copy = np.copy(x_train)
    y_train_copy = np.copy(y_train)
    x_train_def = np.concatenate([x_train, x_train_copy])
    y_train_def = np.concatenate([y_train, y_train_copy])
    del x_train
    del x_train_copy
    del y_train
    del y_train_copy
    x = ds.array(x_train_def, (3000000, data.shape[1]-1))
    y = ds.array(y_train_def, (3000000, 1))
    x_test = ds.array(x_test, (100000, 28))
    y_test = ds.array(y_test, (100000, 1))
    rf = RandomForestClassifier(n_estimators=3, try_features=4, distr_depth=4, n_classes=2, random_state=0)
    compss_barrier()
    start_time = time.time()
    rf.fit(x, y)
    compss_barrier()
    print("Training time:" + str(time.time() - start_time), flush=True)
    print("Accuracy: " + str(compss_wait_on(rf.score(x_test, y_test, collect=True))), flush=True)


if __name__ == "__main__":
    args = sys.argv[1:]
    main(args)
