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
    CSW.`csw-cluster-seed`,
    CSW.`csw-location`,
    CSW.`csw-location-agent`,
    CSW.`csw-config-server`,
    CSW.`csw-config-api`,
    CSW.`csw-config-client`,
    CSW.`csw-config-cli`,
    CSW.`csw-logging`,
    CSW.`csw-messages`,
    CSW.`csw-framework`,
    CSW.`csw-command`,
    CSW.`csw-commons`,
    CSW.`csw-event-api`,
    CSW.`csw-event-client`
  )

  val ClusterSeed: Seq[ModuleID] = Seq(
    CSW.`csw-cluster-seed-tests`,
    CSW.`csw-cluster-seed`,
    CSW.`csw-config-server-tests`,
    CSW.`csw-framework-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val Location: Seq[ModuleID] = Seq(
    CSW.`csw-location-tests`,
    CSW.`csw-location`
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
    CSW.`csw-config-server-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigClientCli: Seq[ModuleID] = Seq(
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
    CSW.`csw-framework`
  ) ++ TestDependencies ++ AllCswLibs

  val Messages: Seq[ModuleID] = Seq(
    CSW.`csw-messages-tests`,
    CSW.`csw-messages`
  ) ++ TestDependencies ++ AllCswLibs

  val Command: Seq[ModuleID] = Seq(
    CSW.`csw-command-tests`,
    CSW.`csw-command`
  ) ++ TestDependencies ++ AllCswLibs

  val EventClient: Seq[ModuleID] = Seq(
    CSW.`csw-event-client-tests`,
    CSW.`csw-event-client`
  ) ++ TestDependencies ++ AllCswLibs

  val EventCli: Seq[ModuleID] = Seq(
    CSW.`csw-event-cli-tests`,
    CSW.`csw-event-cli`
  ) ++ TestDependencies ++ AllCswLibs

  val CswRunner: Seq[ModuleID] = Seq(Libs.`scalatest`)
}
