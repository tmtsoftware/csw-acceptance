
lazy val aggregatedProjects: Seq[ProjectReference] = Seq(
  `cluster-seed`,
  `location`,
  `location-agent`,
  `config-server`,
  `config-api`,
  `config-client`,
  `config-client-cli`,
  `logging`,
  `framework`,
  `messages`,
  `command`
)

lazy val `csw-acceptance` = project
  .in(file("."))
  .aggregate(aggregatedProjects: _*)

lazy val `location` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Location
  )

lazy val `location-agent` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.LocationAgent
  )


lazy val `config-server` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.ConfigServer
  )

lazy val `config-api` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.ConfigApi
  )

lazy val `config-client` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.ConfigClient
  )

lazy val `config-client-cli` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.ConfigClientCli
  )

lazy val `logging` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Logging
  )

lazy val `cluster-seed` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.ClusterSeed
  )

lazy val `framework` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Framework
  )

lazy val `messages` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Messages
  )

lazy val `command` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Command
  )

lazy val `event-client` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.EventClient
  )

lazy val `csw-runner` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.CswRunner
  )
