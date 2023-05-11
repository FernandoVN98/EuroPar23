# Mllib Tests
This tests must be executed inside MareNostrum 4
# Strong Scaling
The scripts for the strong scaling tests are the ones that start with strong-scaling-pyspark_NUMBER_nodes.sh, and the pyspark_16_nodes.sh.
These scripts are ready for launching the corresponding test inside the cluster MareNostrum 4. They only require the corresponding path the HIGGs dataset, for example:
```bash
> ./strong_scaling-pyspark_1_node.sh /path/to/the/file/HIGGs.csv
```
# Weak Scaling
The scripts for the weak scaling tests are the ones that start with weak-scaling-pyspark_NUMBER_nodes.sh, and the pyspark_16_nodes.sh.
These scripts are ready for launching the corresponding test inside the cluster MareNostrum 4. They only require the corresponding path the HIGGs dataset, for example:
```bash
> ./weak_scaling-pyspark_1_node.sh /path/to/the/file/HIGGs.csv
```
