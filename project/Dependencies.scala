import sbt.librarymanagement.ModuleID

object Dependencies {

  val TestDependencies: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    Libs.`junit`,
    Libs.`junit-interface`,
    Libs.`mockito-core`,
    Libs.`gson`,
    Libs.`scalatest-embedded-kafka`,
    Libs.`embedded-redis`,
    Akka.`akka-stream-testkit`,
    Akka.`akka-actor-testkit-typed`,
    Akka.`akka-multi-node-testkit`,
    Libs.`testng`,
    CSW.`csw-commons-tests`
  )

  val AllCswLibs: Seq[ModuleID] = Seq(
    CSW.`csw-admin-server`,
    CSW.`csw-location-server`,
    CSW.`csw-location-agent`,
    CSW.`csw-config-server`,
    CSW.`csw-config-api`,
    CSW.`csw-config-client`,
    CSW.`csw-config-cli`,
    CSW.`csw-logging`,
    CSW.`csw-params`,
    CSW.`csw-framework`,
    CSW.`csw-command`,
    CSW.`csw-commons`,
    CSW.`csw-event-api`,
    CSW.`csw-event-client`,
    CSW.`csw-alarm-api`,
    CSW.`csw-alarm-client`,
    CSW.`csw-alarm-cli`
  )

  val AdminServer: Seq[ModuleID] = Seq(
    CSW.`csw-admin-server-tests`,
    CSW.`csw-admin-server`,
    CSW.`csw-location-server-tests`,
    CSW.`csw-framework-tests`,
    CSW.`csw-config-server-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val LocationServer: Seq[ModuleID] = Seq(
    CSW.`csw-location-server-tests`,
    CSW.`csw-location-server`,
    CSW.`csw-config-server-tests`,
    CSW.`csw-framework-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val LocationAgent: Seq[ModuleID] = Seq(
    CSW.`csw-location-agent-tests`,
    CSW.`csw-location-agent`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigServer: Seq[ModuleID] = Seq(
    CSW.`csw-config-server-tests`,
    CSW.`csw-config-server`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigApi: Seq[ModuleID] = Seq(
    CSW.`csw-config-api-tests`,
    CSW.`csw-config-api`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigClient: Seq[ModuleID] = Seq(
    CSW.`csw-config-client-tests`,
    CSW.`csw-config-client`,
    CSW.`csw-location-server-tests`,
    CSW.`csw-config-server-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigCli: Seq[ModuleID] = Seq(
    CSW.`csw-config-cli-tests`,
    CSW.`csw-config-cli`
  ) ++ TestDependencies ++ AllCswLibs

  val Logging: Seq[ModuleID] = Seq(
    CSW.`csw-logging-tests`,
    CSW.`csw-logging`
  ) ++ TestDependencies ++ AllCswLibs

  val Framework: Seq[ModuleID] = Seq(
    CSW.`csw-framework-tests`,
    CSW.`csw-event-client-tests`,
    CSW.`csw-location-server-tests`,
    CSW.`csw-framework`
  ) ++ TestDependencies ++ AllCswLibs

  val Params: Seq[ModuleID] = Seq(
    CSW.`csw-params-tests`,
    CSW.`csw-params`
  ) ++ TestDependencies ++ AllCswLibs

  val Command: Seq[ModuleID] = Seq(
    CSW.`csw-command-tests`,
    CSW.`csw-command`
  ) ++ TestDependencies ++ AllCswLibs

  val EventClient: Seq[ModuleID] = Seq(
    CSW.`csw-event-client-tests`,
    CSW.`csw-event-client`,
    CSW.`csw-location-server-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val EventCli: Seq[ModuleID] = Seq(
    CSW.`csw-event-cli-tests`,
    CSW.`csw-event-cli`
  ) ++ TestDependencies ++ AllCswLibs

  val AlarmApi: Seq[ModuleID] = Seq(
    CSW.`csw-alarm-api-tests`,
    CSW.`csw-alarm-api`
  ) ++ TestDependencies ++ AllCswLibs

  val AlarmClient: Seq[ModuleID] = Seq(
    CSW.`csw-alarm-client-tests`,
    CSW.`csw-alarm-client`,
    CSW.`csw-logging-tests`,
    CSW.`csw-location-server-tests`

  ) ++ TestDependencies ++ AllCswLibs

  val AlarmCli: Seq[ModuleID] = Seq(
    CSW.`csw-alarm-cli-tests`,
    CSW.`csw-alarm-cli`,
    CSW.`csw-location-server-tests`,
    CSW.`csw-config-server-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val CswRunner: Seq[ModuleID] = Seq(Libs.`scalatest`)
}
