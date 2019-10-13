addSbtPlugin("com.geirsson"      % "sbt-scalafmt"        % "1.5.1")
addSbtPlugin("org.foundweekends" % "sbt-bintray"         % "0.5.4")
addSbtPlugin("com.typesafe.sbt"  % "sbt-native-packager" % "1.3.6")
addSbtPlugin("com.eed3si9n"      % "sbt-buildinfo"       % "0.9.0")
addSbtPlugin("com.dwijnand"      % "sbt-dynver"          % "3.3.0")
addSbtPlugin("com.typesafe.sbt"  % "sbt-multi-jvm"       % "0.4.0")

resolvers += "Jenkins repo" at "https://repo.jenkins-ci.org/public/"
addSbtPlugin("ohnosequences" % "sbt-github-release" % "0.7.0")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.1.0-M13-4")

classpathTypes += "maven-plugin"

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin"  % "0.9.4"
libraryDependencies += "com.sun.activation"   % "javax.activation" % "1.2.0" // Required for jdk 11

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
