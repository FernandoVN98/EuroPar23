# COMPSs Tests
This tests must be executed inside MareNostrum 4
# Strong Scaling
The bash script strong_scaling.sh is ready to launch all the strong scaling tests. It only needs one argument, the path to the HIGGs file dataset. For example
```bash
> ./strong_scaling.sh /path/to/the/file/HIGGs.csv
```
# Weak Scaling
The bash script launch_weak_scaling.sh is ready to launch all the weak scaling tests. It only needs one argument, the path to the HIGGs file dataset. For example
```bash
> ./launch_weak_scaling.sh /path/to/the/file/HIGGs.csv
```

# Results
The results can be found in the same directory that the tests are launched. The name of the output files will be: compss-${JOB_ID}.out and compss-${JOB_ID}.err. The file compss-${JOB_ID}.out will contain the results.
