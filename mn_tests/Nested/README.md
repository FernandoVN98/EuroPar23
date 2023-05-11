# Nested Tests
This tests must be executed in the cluster MareNostrum 4
# Strong Scaling
The scripts that will execute the strong scaling tests are: enqueue_4_nodes, enqueue_8_nodes and enqueue_16_nodes. These scripts are 
ready to launch all the strong scaling tests. They only need one argument, the path to the HIGGs file dataset. For example:
```bash
> ./enqueue_4_nodes /path/to/the/file/HIGGs.csv
```
# Weak Scaling
The scripts that will execute the weak scaling tests are: enqueue_1_node_weak, enqueue_2_nodes_weak, enqueue_4_nodes_weak, enqueue_8_nodes_weak and enqueue_16_nodes. These scaripts are ready to launch all
the weak scaling tests. They only need one argument, the path to the HIGGs file dataset. For example:
```bash
> ./enqueue_4_nodes_weak /path/to/the/file/HIGGs.csv
```
