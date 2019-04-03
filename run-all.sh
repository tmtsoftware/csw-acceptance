#!/usr/bin/env bash

set -e

sbt admin-server/run
sbt location-server/run
sbt location-agent/run
sbt config-server/run
sbt config-api/run
sbt config-client/run
sbt config-cli/run
sbt logging/run
sbt framework/run
sbt params/run
sbt command-client/run
sbt event-client/run
sbt event-cli/run
sbt alarm-api/run
sbt alarm-client/run
sbt alarm-cli/run
sbt database/run
sbt aas/run
sbt time/run