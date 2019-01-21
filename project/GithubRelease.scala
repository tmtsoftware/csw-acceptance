import java.io.{BufferedWriter, File, FileWriter}
import java.time.Instant

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

    IO.write(testReportFile, s"CSW Acceptance Testing Report\tRun started \t${Instant.now()}\n")
    // Note: delimiter for the following line should match that in FileAcceptanceTestReporter
    IO.append(testReportFile, "Class\tTest Name\tResult\n")

    files.foreach { file =>
      logger.info(s"Writing from file: ${file.name}")
      IO.append(testReportFile, Source.fromFile(file).mkString)
    }

    testReportFile
  }

  def githubReleases(): Setting[Task[Seq[sbt.File]]] =
    ghreleaseAssets := Seq(testReportsTask.value)
}
