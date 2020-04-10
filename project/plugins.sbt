addSbtPlugin("com.timushev.sbt"  % "sbt-updates"         % "0.5.0")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"        % "2.3.4")
addSbtPlugin("com.typesafe.sbt"  % "sbt-native-packager" % "1.4.1")
addSbtPlugin("org.foundweekends" % "sbt-bintray"         % "0.5.5")
addSbtPlugin("com.eed3si9n"      % "sbt-buildinfo"       % "0.9.0")
addSbtPlugin("com.dwijnand"      % "sbt-dynver"          % "4.0.0")
addSbtPlugin("com.typesafe.sbt"  % "sbt-multi-jvm"       % "0.4.0")

resolvers += "Jenkins repo" at "https://repo.jenkins-ci.org/public/"
addSbtPlugin("ohnosequences" % "sbt-github-release" % "0.7.0")

classpathTypes += "maven-plugin"

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
