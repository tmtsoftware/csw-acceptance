import java.io.{BufferedWriter, File, FileWriter}

import ohnosequences.sbt.GithubRelease.keys.{ghreleaseAssets, ghreleaseRepoName, ghreleaseRepoOrg, githubRelease}
import ohnosequences.sbt.SbtGithubReleasePlugin
import sbt.Keys._
import sbt.{AutoPlugin, Def, Plugins, Setting, Task, taskKey, _}

import scala.io.Source

object GithubRelease extends AutoPlugin {
  val testReportsKey = taskKey[File]("Creates test reports in txt format.")

  val aggregateFilter = ScopeFilter(inAggregates(ThisProject), inConfigurations(Compile))

  override def requires: Plugins = SbtGithubReleasePlugin

  override def projectSettings: Seq[Setting[_]] = Seq(
    ghreleaseRepoOrg := "tmtsoftware",
    ghreleaseRepoName := "csw-acceptance",
    aggregate in githubRelease := false,
    testReportsKey := testReportsTask.value
  )

  def testReportsTask = Def.task {
    val logger = sLog.value

    lazy val testReportFile = target.value / "test-reports.txt"
    val files               = target.all(aggregateFilter).value.map(_ / "test-reports.txt")

    val writer              = new BufferedWriter(new FileWriter(testReportFile))

    writer.write("CSW Acceptance Testing Report\tRun started\t${prettyDate}")
    // Note: delimiter for the following line should match that in FileAcceptanceTestReporter
    writer.append("Class\tTest Name\tResult")

    files.foreach { file =>
      logger.info(s"Writing from file: ${file.name}")
      writer.append(Source.fromFile(file).mkString)
    }

    writer.flush()
    writer.close()
    testReportFile
  }

  def githubReleases(): Setting[Task[Seq[sbt.File]]] =
    ghreleaseAssets := Seq(testReportsTask.value)
}
