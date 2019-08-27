package csw.acceptance.runner

import org.scalatest.tools.Runner

class AcceptanceTestRunner(testProjectName: String) {

  private val testJarRunpath =
    System
      .getProperty("java.class.path")
      .split(":")
      .find(x => x.contains(testProjectName + "_") && x.contains("tests.jar"))
      .getOrElse("")

  def run(): Boolean = runTests(scalaTestParams)

  def run(args: Array[String]): Unit =
    if (runTests(scalaTestParams)) System.exit(0)
    else System.exit(1)

  private val scalaTestParams: Array[String] = Array(
    "-oDF",
    "-C",
    "csw.acceptance.runner.FileAcceptanceTestReporter",
    "-l",
    "csw.commons.tags.FileSystemSensitive",
    "-l",
    "csw.commons.tags.LoggingSystemSensitive",
    "-R",
    testJarRunpath
  )

  private def printReport(): Unit = {
    println("=" * 100)
    println(s"Running tests from jar: [$testJarRunpath]")
    println("=" * 100)
  }

  private def runTests(params: Array[String]): Boolean =
    if (!params.isEmpty) { printReport(); Runner.run(params) } else true
}
