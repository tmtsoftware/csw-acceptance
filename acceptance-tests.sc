import $ivy.`io.get-coursier::coursier:1.1.0-M13-2`
import $ivy.`io.get-coursier::coursier-cache:1.1.0-M13-2`

import java.io.File

import coursier._
import coursier.core.Configuration
import coursier.util.Task.sync
import coursier.util._

import scala.collection.JavaConverters._

@main
def entryPoint(version: String, projects: String*): Unit = {
  val projectNames = if(projects.isEmpty) allProjects else projects.toList
  projectNames.foreach { projectName =>
    new TestModule(projectName, version).run()
  }
}

lazy val allProjects = List(
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

class TestModule(projectName: String, version: String) {

  val testArtifact = Dependency(
    Module(
      Organization("com.github.tmtsoftware.csw"),
      ModuleName(s"${projectName}_2.12")
    ),
    version,
    Configuration.test
  )

  val files: Seq[File] = Fetch()
    .allArtifactTypes()
    .addDependencies(testArtifact)
    .addRepositories(Repositories.jitpack)
    .run()

  val classpath: String = files.mkString(":")

  val testJarRunpath: String =
    files
      .map(_.toString)
      .find(x ⇒ x.contains(projectName) && x.contains("tests.jar"))
      .getOrElse("")

  val cmds = List(
    "java",
    "-cp",
    classpath,
    "org.scalatest.tools.Runner",
    "-oDF",
    "-l",
    "csw.commons.tags.FileSystemSensitive",
    "-l",
    "csw.commons.tags.LoggingSystemSensitive",
    "-R",
    testJarRunpath
  )

  def run(): Process = {
    val builder = new ProcessBuilder(cmds.asJava).inheritIO()
    println(s"***************** Running acceptance tests for $projectName *****************")
    println(s"Test jar: $testJarRunpath")
    val process = builder.start()
    process.onExit().get()
  }
}
