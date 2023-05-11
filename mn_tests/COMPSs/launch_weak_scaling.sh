
module load dislib/master
module load python/3.7.4
module unload COMPSs/2.10
module load COMPSs/3.1
export ComputingUnits=4

wait_and_get_jobID() {
  # Wait
  sleep 6

  # Get jobID
  jobID=$(squeue -h | sort -k1 | tail -n 1 | cut -c11-18)
  echo "jobID = $jobID"
}

jobID="None"

enqueue_compss \
  --qos=debug \
  --num_nodes=2 \
  --log_level=off \
  --worker_in_master_cpus=0  \
  --scheduler="es.bsc.compss.scheduler.orderstrict.fifo.FifoTS" \
  --worker_working_dir=$(pwd) \
  --master_working_dir=$(pwd) \
  --pythonpath=$(pwd) \
  --base_log_dir=$(pwd) --job_name=rf --exec_time=120 $(pwd)/main_forest_weak_scaling_1_node.py $1

wait_and_get_jobID

enqueue_compss \
  --qos=debug \
  --num_nodes=3 \
  --job_dependency=$jobID \
  --log_level=off \
  --worker_in_master_cpus=0  \
  --scheduler="es.bsc.compss.scheduler.orderstrict.fifo.FifoTS" \
  --worker_working_dir=$(pwd) \
  --master_working_dir=$(pwd) \
  --pythonpath=$(pwd) \
  --base_log_dir=$(pwd) --job_name=rf --exec_time=120 $(pwd)/main_forest_weak_scaling_2_nodes.py $1

wait_and_get_jobID

enqueue_compss \
  --qos=debug \
  --num_nodes=5 \
  --job_dependency=$jobID \
  --log_level=off \
  --worker_in_master_cpus=0  \
  --scheduler="es.bsc.compss.scheduler.orderstrict.fifo.FifoTS" \
  --worker_working_dir=$(pwd) \
  --master_working_dir=$(pwd) \
  --pythonpath=$(pwd) \
  --base_log_dir=$(pwd) --job_name=rf --exec_time=120 $(pwd)/main_forest_weak_scaling_4_nodes.py $1

wait_and_get_jobID
  
enqueue_compss \
  --qos=debug \
  --num_nodes=9 \
  --job_dependency=$jobID \
  --log_level=off \
  --worker_in_master_cpus=0  \
  --scheduler="es.bsc.compss.scheduler.orderstrict.fifo.FifoTS" \
  --worker_working_dir=$(pwd) \
  --master_working_dir=$(pwd) \
  --pythonpath=$(pwd) \
  --base_log_dir=$(pwd) --job_name=rf --exec_time=120 $(pwd)/main_forest_weak_scaling_8_nodes.py $1

wait_and_get_jobID

enqueue_compss \
  --qos=bsc_cs \
  --num_nodes=17 \
  --job_dependency=$jobID \
  --worker_in_master_cpus=0  \
  --worker_working_dir=$(pwd)  \
  --master_working_dir=$(pwd)  \
  --pythonpath=$(pwd)   \
  --base_log_dir=$(pwd)  --job_name=rf --exec_time=120 $(pwd)/main_strong_scaling.py $1
