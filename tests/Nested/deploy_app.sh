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
    compss_agent_start --hostname=${WORKER_IP} -d --classpath=${APP_DIR} --pythonpath=${APP_DIR}/ --rest_port=${REST_PORT} --comm_port=${COMM_PORT} --log_dir=/tmp/Agent${i} >/tmp/Agent${i}.out 2>/tmp/Agent${i}.err
#  " >/dev/null 2>/dev/null
done

echo "    Waiting for agents to be ready..."
echo "    Agents are up and running!"

