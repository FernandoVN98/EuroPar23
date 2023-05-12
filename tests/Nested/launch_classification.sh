#!/bin/bash

./deploy_app.sh &

agent_PID=${!}

sleep 5

./launch_app.sh 127.0.0.1 46101 main_classification.py

echo "Waiting for result"

wait ${agent_PID}

grep "Training time" "/tmp/Agent1/jobs/job1_NEW.out"
