#!/usr/bin/env bash

# Exit status
e=0

# Run all builds and exit with non-zero if any of them failed
sbt aas/run || e=$?
sbt admin-server/run || e=$?
sbt alarm/run || e=$?
sbt command/run || e=$?
sbt config/run || e=$?
sbt database/run || e=$?
sbt event/run || e=$?
sbt examples/run || e=$?
sbt framework/run || e=$?
sbt location/run || e=$?
sbt logging/run || e=$?
sbt network-utils/run || e=$?
sbt params/run || e=$?
sbt testkit/run || e=$?
sbt time/run || e=$?

exit $e
