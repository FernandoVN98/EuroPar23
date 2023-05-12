#!/bin/bash

/usr/sbin/sshd -D &

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

if [ "${#}" -eq 0 ]; then
  echo "Select test to execute: compss_classification | compss_regression | nested_classification | nested_regression"
fi

if [ "${1}" == "compss_classification" ]; then
  shift 1
  cd "${DIR}/tests/COMPSs"
  ./launch_classification.sh $*
  cd "${DIR}"
  exit $?
elif [ "${1}" == "compss_regression" ]; then
  shift 1
  cd "${DIR}/tests/COMPSs"
  ./launch_regression.sh $*
  cd "${DIR}"
  exit $?
elif [ "${1}" == "nested_classification" ]; then
  shift 1
  cd "${DIR}/tests/Nested"
  ./launch_classification.sh $*
  cd "${DIR}" 
  exit $?
elif [ "${1}" == "nested_regression" ]; then
  shift 1
  cd "${DIR}/tests/Nested"
  ./launch_regression.sh $*
  cd "${DIR}"
  exit $?
else 
  echo "Unknown test ${1}. Select test to execute: compss_classification | compss_regression | nested_classification | nested_regression"
  exit 1
fi
