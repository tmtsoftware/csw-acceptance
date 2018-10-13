
lazy val aggregatedProjects: Seq[ProjectReference] = Seq(
  `location-server`,
  `location-agent`,
  `config-server`,
  `config-api`,
  `config-client`,
  `config-cli`,
  `logging`,
  `framework`,
  `params`,
  `command`,
  `event-client`,
  `event-cli`,
  `alarm-api`,
  `alarm-client`,
  `alarm-cli`
)

lazy val `csw-acceptance` = project
  .in(file("."))
  .aggregate(aggregatedProjects: _*)

lazy val `admin-server` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.AdminServer
  )

lazy val `location-server` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.LocationServer
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

lazy val `config-cli` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.ConfigCli
  )

lazy val `logging` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Logging
  )

lazy val `framework` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Framework
  )

lazy val `params` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Params
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

lazy val `event-cli` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.EventCli
  )

lazy val `alarm-api` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.AlarmApi
  )

lazy val `alarm-client` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.AlarmClient
  )

lazy val `alarm-cli` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.AlarmCli
  )

lazy val `csw-runner` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.CswRunner
  )
