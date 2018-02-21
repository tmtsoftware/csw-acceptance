
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
  .settings(
    libraryDependencies ++= Dependencies.Location
  )

lazy val `location-agent` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.LocationAgent
  )


lazy val `config-server` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.ConfigServer
  )

lazy val `config-api` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.ConfigApi
  )

lazy val `config-client` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.ConfigClient
  )

lazy val `config-client-cli` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.ConfigClientCli
  )

lazy val `logging` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.Logging
  )

lazy val `cluster-seed` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.ClusterSeed
  )

lazy val `framework` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.Framework
  )

lazy val `messages` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.Messages
  )

lazy val `command` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.Command
  )
