#!/bin/bash
  
#SBATCH --chdir=.
#SBATCH --output=$(pwd)/weak-HIGGS_8_nodes-%j.out
#SBATCH --error=$(pwd)/weak-HIGGS_8_nodes-%j.err
#SBATCH --qos=debug
#SBATCH --time=02:00:00
# 48 allocates all CPUs in a MN node
#SBATCH --cpus-per-task=48 
#SBATCH --constraint=highmem
# nodes indicates the number of workers that will be created
# (master node also doubles as a worker) This number can be changed
#SBATCH --nodes=8

# tasks-per-node must ALWAYS be 1, otherwise
# each node will spawn multiple workers
#SBATCH --tasks-per-node=1 

module load java/8u131
module load python/3.7.4


# PySpark initialization

export SPARK_LOG_DIR=$PWD/pyspark-logs
# Get all the reserved nodes
# The format is a node for every new line
nodes=$(scontrol show hostname)

# Get Master node from the node list
read -r master_node <<< "$nodes"
master_ip=$(getent hosts $master_node | awk '{ print $1 }')

export MasterIP=$master_ip


echo " Starting master on node: $master_node..."
/apps/SPARK/spark-3.1.2-bin-hadoop3.2//sbin/start-master.sh
sleep 5


# Read every line and get the nodes
while read -r node_name; do
  echo " Starting worker on node: $node_name"
  ssh -n $node_name /apps/SPARK/spark-3.1.2-bin-hadoop3.2//sbin/start-worker.sh spark://$master_ip:7077 -d $PWD/pyspark-workers
done <<< "$nodes"
sleep 10

#export SPARK_HOME=$PWD/Home
# Rest of the job here

/apps/SPARK/spark-3.1.2-bin-hadoop3.2/bin/spark-submit --master spark://$master_ip:7077 --executor-cores 4 --executor-memory 25G --driver-memory 12G  pyspark_HIGGS_8_nodes.py
