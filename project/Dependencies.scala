import sbt.librarymanagement.ModuleID

object Dependencies {

  val TestDependencies: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    Libs.`junit`,
    Libs.`mockito-scala`,
    Libs.`gson`,
//    Libs.`embedded-kafka`,
    Libs.`embedded-redis`,
    Libs.`otj-pg-embedded`,
    Akka.`akka-stream-testkit`,
    Akka.`akka-actor-testkit-typed`,
    Akka.`akka-multi-node-testkit`,
    AkkaHttp.`akka-http-testkit`,
    Libs.`testng`,
    CSW.`csw-commons-tests`,
    Libs.`embedded-keycloak`
  )

  val AllCswLibs: Seq[ModuleID] = Seq(
    CSW.`csw-admin-server`,
    CSW.`csw-location-server`,
    CSW.`csw-location-client`,
    CSW.`csw-location-agent`,
    CSW.`csw-config-server`,
    CSW.`csw-config-api`,
    CSW.`csw-config-client`,
    CSW.`csw-config-cli`,
    CSW.`csw-logging`,
    CSW.`csw-params`,
    CSW.`csw-framework`,
    CSW.`csw-command-client`,
    CSW.`csw-commons`,
    CSW.`csw-event-api`,
    CSW.`csw-event-client`,
    CSW.`csw-alarm-api`,
    CSW.`csw-alarm-client`,
    CSW.`csw-alarm-cli`,
    CSW.`csw-network-utils`
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
    CSW.`csw-location-client`,
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
    CSW.`csw-location-server-tests`,
    CSW.`csw-config-server-tests`,
    CSW.`csw-config-client`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigCli: Seq[ModuleID] = Seq(
    CSW.`csw-config-cli-tests`,
    CSW.`csw-config-server-tests`,
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
    CSW.`csw-config-server-tests`,
    CSW.`csw-framework`
  ) ++ TestDependencies ++ AllCswLibs

  val Params: Seq[ModuleID] = Seq(
    CSW.`csw-params-tests`,
//    Chill.`chill-bijection`,
    CSW.`csw-params`
  ) ++ TestDependencies ++ AllCswLibs

  val CommandClient: Seq[ModuleID] = Seq(
    CSW.`csw-command-client-tests`,
    CSW.`csw-command-client`
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

  val Aas: Seq[ModuleID] = Seq(
    CSW.`csw-aas-core-tests`,
    CSW.`csw-aas-http-tests`,
    CSW.`csw-aas-installed-tests`,
    CSW.`csw-aas-http-multi-jvm`,
    CSW.`csw-location-server-multi-jvm`,
    CSW.`csw-location-server-tests`,
    CSW.`csw-aas-core`,
    CSW.`csw-aas-http`,
    CSW.`csw-aas-installed`,
    Libs.`play-json-derived-codecs`,
    Libs.`akka-http-play-json`
  ) ++ TestDependencies ++ AllCswLibs

  val Time: Seq[ModuleID] = Seq(
    CSW.`csw-time-core-tests`,
    CSW.`csw-time-scheduler-tests`,
    CSW.`csw-time-clock-tests`,
    CSW.`csw-time-core`,
    CSW.`csw-time-scheduler`,
    CSW.`csw-time-clock`
  ) ++ TestDependencies ++ AllCswLibs

  val Database: Seq[ModuleID] = Seq(
    CSW.`csw-database-tests`,
    CSW.`csw-database`,
    CSW.`csw-location-server-tests`,
    Akka.`akka-actor`
  ) ++ TestDependencies ++ AllCswLibs

  val CswRunner: Seq[ModuleID] = Seq(
    Libs.`scalatest`
  )

  val CswMultiJvm: Seq[ModuleID] = Seq(
    CSW.`csw-location-server-multi-jvm`,
    CSW.`csw-config-client-multi-jvm`,
    CSW.`csw-config-cli-multi-jvm`,
    CSW.`csw-framework-multi-jvm`,
    CSW.`csw-event-client-multi-jvm`,
    CSW.`csw-aas-http-multi-jvm`,
    CSW.`csw-framework-tests`,
    CSW.`csw-location-server-tests`,
    CSW.`csw-config-server-tests`,
    CSW.`csw-config-client-tests`,
    CSW.`csw-event-client-tests`

  ) ++ TestDependencies ++ AllCswLibs
}
