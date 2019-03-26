package csw.acceptance.runner

object Main extends App {
  val Version = "0.1-SNAPSHOT"

  val projectNames = List(
    "csw-admin-server",
    "csw-location-server",
    "csw-location-agent",
    "csw-config-server",
    "csw-config-api",
    "csw-config-client",
    "csw-config-cli",
    "csw-logging",
    "csw-framework",
    "csw-params",
    "csw-command-client",
    "csw-event-client",
    "csw-event-cli",
    "csw-alarm-api",
    "csw-alarm-client",
    "csw-alarm-cli"
  )

  projectNames.foreach { projectName =>
    println(s"Running tests from $projectName*******************************************************************")
    new TestModule(projectName, Version).run()
  }
}
