#!/usr/bin/env bash

sbt cluster-seed/run
sbt command/run
sbt config-api/run
sbt config-client/run
sbt config-client-cli/run
sbt config-server/run
sbt framework/run
sbt location/run
sbt logging/run
sbt messages/run