package csw.logging.runner

import java.net.URLClassLoader

import org.scalatest.tools.Runner

object RunAll {
  def main(args: Array[String]): Unit = {

    val uRLs = getClass.getClassLoader
      .asInstanceOf[URLClassLoader]
      .getURLs

    val testJarsRunpath = uRLs.map(_.getPath).find(x ⇒ x.contains("csw-logging") && x.contains("tests.jar")).getOrElse("")

    val params = Array("-o", "-l", "csw.commons.tags.ClasspathSensitive", "-R", testJarsRunpath)

    println("=" * 100)
    println(s"Running tests from jar: [$testJarsRunpath]")
    println("=" * 100)

    Runner.main(params)
  }
}
