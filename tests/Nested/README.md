# Nested local tests
There are two different test scripts main_classification.py and main_regression.py, each one correspond to a different test.

There are also two bash scripts: deploy_app.sh and launch_app.sh. In order to execute in a local laptop the nested application it is needed to launch at first the deploy_app.sh:
```bash
> ./deploy_app.sh
```
Then the launch_app.sh script is executed with 3 arguments, the first one is the MASTER_IP, the second one is the MASTER_REST_PORT and the third one is the test script to execute. For example:
```bash
> ./launch_app.sh 127.0.0.1 46101 main_classification.py
```
