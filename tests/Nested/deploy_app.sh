#!/bin/bash

# deploy_app.sh --> deploys 1 agent on port 46000
# deploy_app.sh N --> deploys 1 agent on port P
# deploy_app.sh N P--> deploys N agents from port P to P+N-1

if [ $# -eq 0 ]; then
  port=46000
  numWorkers=1
else
  numWorkers=$1
  if [ $# -eq 1 ]; then
    port=46000
  else
    port=$2
  fi
fi

SCRIPT_DIR="$(dirname "${BASH_SOURCE[0]}")"
SCRIPT_DIR="$(cd ${SCRIPT_DIR} && pwd)"

#echo "    Closing previous Yakuake sessions"
#ACTIVE_SESSIONS=`qdbus org.kde.yakuake /yakuake/sessions sessionIdList`
#OLD_IFS=${IFS}
#IFS=',' read -ra ADDR <<< "${ACTIVE_SESSIONS}"
#for SESSION in "${ADDR[@]}"; do
#	SESSION_TITLE=`qdbus org.kde.yakuake /yakuake/tabs tabTitle ${SESSION}`
#	if [[ "${SESSION_TITLE}" == Agent* ]]; then
#		qdbus org.kde.yakuake /yakuake/sessions removeSession ${SESSION} > /dev/null
#	fi
#done
#IFS=${OLD_IFS}


echo "    Start agents..."
APP_DIR="${SCRIPT_DIR}/"
for i in $(seq 1 "${numWorkers}"); do
  WORKER_IP="127.0.0.${i}"
  REST_PORT=$(( port + ${i} *100 + 1))
  COMM_PORT=$(( port + ${i} *100 + 2))
  echo "        Starting agent ${WORKER_IP} on ports ${REST_PORT}(REST) and ${COMM_PORT}(comm)"
#  WORKER_SESSION=`qdbus org.kde.yakuake /yakuake/sessions addSession`
#  qdbus org.kde.yakuake /yakuake/tabs setTabTitle ${WORKER_SESSION} Agent${i} > /dev/null
#  qdbus org.kde.yakuake /yakuake/sessions org.kde.yakuake.runCommandInTerminal ${WORKER_SESSION} "\
    compss_agent_start --hostname=${WORKER_IP} -d -t --classpath=${APP_DIR} --pythonpath=${APP_DIR}/ --rest_port=${REST_PORT} --comm_port=${COMM_PORT} --log_dir=/tmp/Agent${i} >/tmp/Agent${i}.out 2>/tmp/Agent${i}.err
#  " >/dev/null 2>/dev/null
done

echo "    Waiting for agents to be ready..."
CONFIRMED_AGENTS=0
while [ ${CONFIRMED_AGENTS} -lt ${numWorkers} ]; do
  CONFIRMED_AGENTS=0
  for i in $(seq 1 "${numWorkers}"); do
    WORKER_IP="127.0.0.${i}"
    REST_PORT=$(( port + ${i} *100 + 1))
    curl -XGET http://${WORKER_IP}:${REST_PORT}/COMPSs/test 2>/dev/null
    if [ $? -eq 0 ]; then
      CONFIRMED_AGENTS=$(( CONFIRMED_AGENTS + 1))
    fi
  done
done
echo "    Agents are up and running!"

i=1
MASTER_IP="127.0.0.${i}"
MASTER_REST_PORT=$(( port + ${i} *100 + 1))

compss_agent_add_resources "--agent_node=${MASTER_IP}" "--cpu=4" "--agent_port=${MASTER_REST_PORT}" "${MASTER_IP}" >/dev/null

if [ ${numWorkers} -gt 1 ]; then
  echo "    Adding resources to worker1"
  for i in $(seq 2 "${numWorkers}"); do
    WORKER_IP="127.0.0.${i}"
    COMM_PORT=$(( port + ${i} *100 + 2))
    echo "        Adding ${WORKER_IP} on port ${COMM_PORT}"
    compss_agent_add_resources "--agent_node=${MASTER_IP}" "--agent_port=${MASTER_REST_PORT}" "${WORKER_IP}" "Port=${COMM_PORT}" >/dev/null
  done
fi

curl -XGET "http://${MASTER_IP}:${MASTER_REST_PORT}/COMPSs/printResources" 2>/dev/null
