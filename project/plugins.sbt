addSbtPlugin("com.geirsson"      % "sbt-scalafmt"        % "1.5.1")
addSbtPlugin("org.foundweekends" % "sbt-bintray"         % "0.5.4")
addSbtPlugin("com.typesafe.sbt"  % "sbt-native-packager" % "1.3.5")
addSbtPlugin("com.eed3si9n"      % "sbt-buildinfo"       % "0.9.0")

resolvers += "Jenkins repo" at "http://repo.jenkins-ci.org/public/"
addSbtPlugin("ohnosequences" % "sbt-github-release" % "0.7.0")

classpathTypes += "maven-plugin"

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.7.4"

scalacOptions ++= Seq(
  "-encoding",
  "UTF-8",
  "-feature",
  "-unchecked",
  "-deprecation",
  //"-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Xfuture"
)
