package csw.clusterseed.runner

import java.net.URLClassLoader

import org.scalatest.tools.Runner

object Run {
  def main(args: Array[String]): Unit = {

    val testJarsRunpath = getClass.getClassLoader
      .asInstanceOf[URLClassLoader]
      .getURLs
      .map(_.getPath)
      .find(x ⇒ x.contains("csw-cluster-seed") && x.contains("tests.jar"))
      .getOrElse("")

    val params = Array("-o", "-l", "csw.commons.tags.ClasspathSensitive", "-R", testJarsRunpath)

    println("=" * 100)
    println(s"Running tests from jar: [$testJarsRunpath]")
    println("=" * 100)

    Runner.main(params)
  }
}
