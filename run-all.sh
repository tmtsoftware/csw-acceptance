#!/usr/bin/env bash

# Exit status
e=0

# Run all builds and exit with non-zero if any of them failed
sbt admin-server/run || e=$?
sbt location-server/run || e=$?
sbt location-agent/run || e=$?
sbt config-server/run || e=$?
sbt config-api/run || e=$?
sbt config-client/run || e=$?
sbt config-cli/run || e=$?
sbt logging/run || e=$?
sbt framework/run || e=$?
sbt params/run || e=$?
sbt command-client/run || e=$?
sbt event-client/run || e=$?
sbt event-cli/run || e=$?
sbt alarm-api/run || e=$?
sbt alarm-client/run || e=$?
sbt alarm-cli/run || e=$?
sbt database/run || e=$?
sbt aas/run || e=$?
sbt time/run || e=$?

exit $e
