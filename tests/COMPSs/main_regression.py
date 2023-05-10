from pycompss.api.api import compss_wait_on, compss_barrier
import dislib as ds
from sklearn.datasets import make_classification, make_regression
import time
from COMPSs.forest import RandomForestRegressor


def main():
    x, y = make_regression(n_samples=280000, n_features=5, n_informative=3, random_state=0)
    x_test = ds.array(x[270000:], (5000, 5))
    y_test = ds.array(y[270000:], (5000, 1))
    x = ds.array(x[:270000], (30000, 5))
    y = ds.array(y[:270000], (30000, 1))
    rf = RandomForestRegressor(try_features=2, n_estimators=8, distr_depth=3, random_state=0)
    compss_barrier()
    start_time = time.time()
    rf.fit(x, y)
    compss_barrier()
    print("Training time: " + str(time.time() - start_time))
    print(rf.score(x_test, y_test, collect=True))



if __name__ == "__main__":
    main()
