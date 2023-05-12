ARG DEBIAN_FRONTEND=noninteractive

FROM compss/compss-tutorial:3.1

COPY ./framework /framework

# Install COMPSs
RUN cd /framework && \
    export EXTRAE_MPI_HEADERS=/usr/include/x86_64-linux-gnu/mpi && \
    /framework/builders/buildlocal -K -J -T -D -C -M --skip-tests /opt/COMPSs && \
    rm -rf /framework

COPY ./dislib /dislib

ENV PYTHONPATH=$PYTHONPATH:/dislib:/opt/COMPSs/Bindings/python/3/
ENV LC_ALL=C.UTF-8
RUN python3 -m pip install --trusted-host pypi.org --trusted-host files.pythonhosted.org --upgrade -r /dislib/requirements.txt

ENV COMPSS_LOAD_SOURCE false

COPY ./tests /tests
COPY ./mn_tests /mn_tests

COPY ./launch_test.sh /launch_test.sh

# Expose SSH port and run SSHD
EXPOSE 22

ENTRYPOINT ["/launch_test.sh"]
