# csw-acceptance

Aim of maintaining this repository is to run all the existing java and scala tests from [CSW-PROD](https://github.com/tmtsoftware/csw-prod) repo on published bintray binaries rather than directly on source code.

This repository just contains java and scala test runners. In order to avoid classpath ordering issue, we need to create sub-modules for each service like location, admin etc. (Similar to [CSW-PROD](https://github.com/tmtsoftware/csw-prod) repo)

> Classpth Ordering issue:
> If we have single app which depends on all the csw-prod tests libraries then there is no guarantee correct `application.conf` will be picked up by main application.
> This results into tests failures. 
> As most of the tests has their own `application.conf` in their corresponding test scope.

Every module contains exactly similar app (Run.scala), but each module depends on corresponding csw-prod published test and compile library jar.
For Example, location module mainly depends on following:
```sh
val `csw-location-server`       = "com.github.tmtsoftware.csw" %% "csw-location-server" % Version
val `csw-location-server-tests` = "com.github.tmtsoftware.csw" %% "csw-location-server" % Version classifier "tests"
```

Run application from each module takes following command line arguments:
1. No Args: This runs both scala and java tests
2. -java: This just runs java tests
3. -scala: This just runs scala tests

## Pre-requisite (Environment Variable Setup)
Before running any tests, make sure that you have correct env variables setup based on below table:

| Env var | Value | Description |
|  -----  | ----- |    -----    |
| BUILD_ENV | PROD | If this is set, then Env Var RELEASE_VERSION is expected to be set |
| BUILD_ENV | DEV | If this is set, then Env Var DEV_VERSION is expected to be set |
| RELEASE_VERSION | Ex. 0.1.2+1382-e9c8523b+20180223-1035 | When BUILD_ENV=PROD then cw-prod libraries with this version will be pulled |
| DEV_VERSION | Ex. 0.1-SNAPSHOT | When BUILD_ENV=DEV then cw-prod libraries with this version will be pulled |


## Running Tests
1. `sbt location-server/run` : Runs scala and java tests from location-server
4. `run-all.sh` : This script runs both scala and java tests from all the projects.
