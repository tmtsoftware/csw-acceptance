import sbt.librarymanagement.ModuleID

object Dependencies {

  val TestDependencies = Seq(
    Libs.`scalatest`,
    Libs.`junit`,
    Libs.`junit-interface`,
    Libs.`mockito-core`,
    Akka.`akka-stream-testkit`,
    Akka.`akka-multi-node-testkit`,
    Libs.`gson`,
    CSW.`csw-commons-tests`
  )

  val AllCswLibs = Seq(
    CSW.`csw-cluster-seed`,
    CSW.`csw-location`,
    CSW.`csw-location-agent`,
    CSW.`csw-config-server`,
    CSW.`csw-config-api`,
    CSW.`csw-config-client`,
    CSW.`csw-config-client-cli`,
    CSW.`csw-logging`,
    CSW.`csw-messages`,
    CSW.`csw-framework`,
    CSW.`csw-command`,
    CSW.`csw-commons`
  )

  val ClusterSeed: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-cluster-seed-tests`,
    CSW.`csw-cluster-seed`,
    CSW.`csw-config-server-tests`,
    CSW.`csw-framework-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val Location: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-location-tests`,
    CSW.`csw-location`
  ) ++ TestDependencies ++ AllCswLibs

  val LocationAgent: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-location-agent-tests`,
    CSW.`csw-location-agent`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigServer: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-config-server-tests`,
    CSW.`csw-config-server`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigApi: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-config-api-tests`,
    CSW.`csw-config-api`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigClient: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-config-client-tests`,
    CSW.`csw-config-client`,
    CSW.`csw-config-server-tests`
  ) ++ TestDependencies ++ AllCswLibs

  val ConfigClientCli: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-config-client-cli-tests`,
    CSW.`csw-config-client-cli`
  ) ++ TestDependencies ++ AllCswLibs

  val Logging: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-logging-tests`,
    CSW.`csw-logging`
  ) ++ TestDependencies ++ AllCswLibs

  val Framework: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-framework-tests`,
    CSW.`csw-framework`
  ) ++ TestDependencies ++ AllCswLibs

  val Messages: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-messages-tests`,
    CSW.`csw-messages`
  ) ++ TestDependencies ++ AllCswLibs

  val Command: Seq[ModuleID] = Seq(
    Libs.`scalatest`,
    CSW.`csw-command-tests`,
    CSW.`csw-command`
  ) ++ TestDependencies ++ AllCswLibs

}
