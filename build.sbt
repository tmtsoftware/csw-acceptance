lazy val aggregatedProjects: Seq[ProjectReference] = Seq(
  `aas`,
  `admin-server`,
  `alarm`,
  `command`,
  `config`,
  `database`,
  `event`,
  `framework`,
  `location`,
  `logging`,
  `network-utils`,
  `params`,
  `testkit`,
  `time`
)

lazy val `csw-acceptance` = project
  .in(file("."))
  .enablePlugins(GithubRelease)
  .aggregate(aggregatedProjects: _*)
  .settings(GithubRelease.githubReleases())

lazy val `admin-server` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.AdminServer
  )

lazy val `location` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Location
  )

lazy val `config` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Config
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

lazy val `event` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Event
  )

lazy val `alarm` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Alarm
  )

lazy val `aas` = project
  .enablePlugins(DeployApp, AutoMultiJvm)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Aas
  )

lazy val `time` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Time
  )

lazy val `database` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Database
  )

lazy val `examples` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Examples
  )

lazy val `network-utils` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Utils
  )

lazy val `testkit` = project
  .enablePlugins(DeployApp)
  .dependsOn(`csw-runner`)
  .settings(
    libraryDependencies ++= Dependencies.Testkit
  )

lazy val `csw-multi-jvm` = project
  .enablePlugins(DeployApp, AutoMultiJvm)
  .settings(
    libraryDependencies ++= Dependencies.CswMultiJvm
  )

lazy val `csw-runner` = project
  .enablePlugins(DeployApp)
  .settings(
    libraryDependencies ++= Dependencies.CswRunner
  )
