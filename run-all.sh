#!/usr/bin/env bash

sbt admin-server/run
sbt location-server/run
sbt config-api/run
sbt config-server/run
sbt config-client/run
sbt config-cli/run
sbt logging/run
sbt params/run
sbt command/run
sbt framework/run
sbt event-client/run
sbt event-cli/run
sbt alarm-api/run
sbt alarm-client/run
sbt alarm-cli/run