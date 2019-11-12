import sbt.Keys._
import sbt._
import sbt.plugins.JvmPlugin

object Common extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  override def requires: Plugins = JvmPlugin

  val detectCycles: SettingKey[Boolean] = settingKey[Boolean]("is cyclic check enabled?")

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    dependencyOverrides += AkkaHttp.`akka-http-spray-json`,
    organization := "org.tmt",
    organizationName := "TMT Org",
    scalaVersion := Libs.ScalaVersion,
    concurrentRestrictions in Global += Tags.limit(Tags.All, 1),
    homepage := Some(url("https://github.com/tmtsoftware/csw-acceptance")),
    scmInfo := Some(
      ScmInfo(url("https://github.com/tmtsoftware/csw-acceptance"), "git@github.com:tmtsoftware/csw-acceptance.git")
    ),
    licenses := Seq(("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))),
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",
      "-feature",
      "-unchecked",
      "-deprecation",
      //"-Xfatal-warnings",
      "-Xlint",
//      "-Yno-adapted-args",
      "-Ywarn-dead-code"
//      "-Xfuture"
//      "-Xprint:typer"
    ),
    javacOptions in (Compile, doc) ++= Seq("-Xdoclint:none"),
    testOptions in Test ++= Seq(
      // show full stack traces and test case durations
      Tests.Argument("-oDF"),
      // -v Log "test run started" / "test started" / "test run finished" events on log level "info" instead of "debug".
      // -a Show stack traces and exception class name for AssertionErrors.
      Tests.Argument(TestFrameworks.JUnit, "-v", "-a")
    ),
    resolvers += Resolver.bintrayRepo("twtmt", "maven"),
    resolvers += "bintray" at "https://jcenter.bintray.com",
    resolvers += "jitpack" at "https://jitpack.io",
    version := {
      sys.props.get("prod.publish") match {
        case Some("true") => version.value
        case _            => "0.1-SNAPSHOT"
      }
    },
    isSnapshot := !sys.props.get("prod.publish").contains("true"),
    cancelable in Global := true,
    fork := true,
    detectCycles := true,
    autoCompilerPlugins := true
  )
}
