# Euro-Par23
This repository contains all the necessary data to reproduce the experiments conducted for the article "Scalable Random Forest with Data-Parallel
Computing" presented in the 29th International European Conference on Parallel and Distributed Computing (Euro-Par2023).

# Organization

The repository is organized in three folders: framework, tests and mn_tests.

The framework folder contains the code of the COMPSs framework and the necessary scripts for its installation.

The mn_tests folders contains the information related to the tests presented on the article. There is only information related with the tests performed with [HIGGs](https://archive.ics.uci.edu/ml/datasets/HIGGS) dataset. We can not include the other dataset because it is a private dataset. The HIGGs dataset can be downloaded from the previous link. There are three folders: one containing the nested application, the second containing the classical COMPSs applications and the third one containing the MLlib version. These folders will contain the code needed and the launching scripts.

These previous tests are not reproducible (in terms of training time) outside MareNostrum 4. In a personal laptop or a small cluster it is possible that the experiments fail due to the lack of computational resources. The main problem is the RAM memory they require to execute.

Finally, we include the tests folder. This folder contains several tests that can be executed in a laptop or small cluster. These tests are included in order to make it easier to check that the code works properly. There will be two folders, one for the nested code and another one with the classical COMPSs version.

# Prepare Environment

To ease the execution of the tests, a container with all the environment set up has been published in docker hub with the tag ```fernandovn98/europar23:latest```. It can be fetch with the following command:
```bash
$ docker pull fernandovn98/europar23:latest
```
To set up the environment on a laptop, it is necessary to install the prototype implementation building it from the sources provided in this repository. The prototype is build on COMPSs v3.1; therefore, it inherits all its [dependencies](https://compss-doc.readthedocs.io/en/3.1/Sections/01_Installation/01_Dependencies.html). 
To install COMPSs on a laptop from its sources run:
```bash
$ cd framework/builders/
$ sudo -E ./buildlocal  -K -J -T -D -C -M --skip-tests /opt/COMPSs
```
To install the runtime on supercomputers, there is additional information on the Installing in [Supercomputers](https://compss-doc.readthedocs.io/en/3.1/Sections/01_Installation/04_Supercomputers.html#) page from COMPSs' official documentation.

# Launch Tests
Inside each of the tests folders there are more details on how to launch the different tests.
