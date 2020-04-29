import sbt._

object Libs {
  val ScalaVersion = "2.13.1"

  val `scalatest`       = "org.scalatest"            %% "scalatest"      % "3.0.8" //Apache License 2.0
  val `junit`           = "junit"                    % "junit"           % "4.12" //Eclipse Public License 1.0
  val `mockito-scala`   = "org.mockito"              %% "mockito-scala"  % "1.14.0"
  val `embedded-redis`  = "com.github.kstyrc"        % "embedded-redis"  % "0.6"
  val `otj-pg-embedded` = "com.opentable.components" % "otj-pg-embedded" % "0.13.3"
  val `testng`          = "org.testng"               % "testng"          % "6.14.3"
  val `gson`            = "com.google.code.gson"     % "gson"            % "2.8.6" //Apache 2.0

  val `embedded-keycloak`        = "com.github.tmtsoftware.embedded-keycloak" %% "embedded-keycloak"        % "98a7c0b" //Apache 2.0
  val `akka-http-play-json`      = "de.heikoseeberger"                        %% "akka-http-play-json"      % "1.27.0" //Apache 2.0
  val `play-json-derived-codecs` = "org.julienrf"                             %% "play-json-derived-codecs" % "6.0.0"

  val `msocket-impl-jvm` = "com.github.tmtsoftware.msocket" %% "msocket-impl-jvm" % "5d44eef"
}

object CSW {
  val Version: String = {
    val env = sys.env ++ sys.props
    env.getOrElse("CSW_VERSION", "0.1-SNAPSHOT")
  }

  //====================== Admin Server =======================
  val `csw-admin-server`       = "com.github.tmtsoftware.csw" %% "csw-admin-server" % Version
  val `csw-admin-server-tests` = "com.github.tmtsoftware.csw" %% "csw-admin-server" % Version classifier "tests"

  //====================== Location =======================
  val `csw-location-api`       = "com.github.tmtsoftware.csw" %% "csw-location-api" % Version
  val `csw-location-api-tests` = "com.github.tmtsoftware.csw" %% "csw-location-api" % Version classifier "tests"

  val `csw-location-models`       = "com.github.tmtsoftware.csw" %% "csw-location-models" % Version
  val `csw-location-models-tests` = "com.github.tmtsoftware.csw" %% "csw-location-models" % Version classifier "tests"

  val `csw-location-server`           = "com.github.tmtsoftware.csw" %% "csw-location-server" % Version
  val `csw-location-server-tests`     = "com.github.tmtsoftware.csw" %% "csw-location-server" % Version classifier "tests"
  val `csw-location-server-multi-jvm` = "com.github.tmtsoftware.csw" %% "csw-location-server" % Version classifier "multi-jvm"

  val `csw-location-agent`       = "com.github.tmtsoftware.csw" %% "csw-location-agent" % Version
  val `csw-location-agent-tests` = "com.github.tmtsoftware.csw" %% "csw-location-agent" % Version classifier "tests"

  val `csw-location-client`       = "com.github.tmtsoftware.csw" %% "csw-location-client" % Version
  val `csw-location-client-tests` = "com.github.tmtsoftware.csw" %% "csw-location-client" % Version classifier "tests"

  //====================== Config =======================
  val `csw-config-api`       = "com.github.tmtsoftware.csw" %% "csw-config-api" % Version
  val `csw-config-api-tests` = "com.github.tmtsoftware.csw" %% "csw-config-api" % Version classifier "tests"

  val `csw-config-cli`           = "com.github.tmtsoftware.csw" %% "csw-config-cli" % Version
  val `csw-config-cli-tests`     = "com.github.tmtsoftware.csw" %% "csw-config-cli" % Version classifier "tests"
  val `csw-config-cli-multi-jvm` = "com.github.tmtsoftware.csw" %% "csw-config-cli" % Version classifier "multi-jvm"

  val `csw-config-client`           = "com.github.tmtsoftware.csw" %% "csw-config-client" % Version
  val `csw-config-client-tests`     = "com.github.tmtsoftware.csw" %% "csw-config-client" % Version classifier "tests"
  val `csw-config-client-multi-jvm` = "com.github.tmtsoftware.csw" %% "csw-config-client" % Version classifier "multi-jvm"

  val `csw-config-models`       = "com.github.tmtsoftware.csw" %% "csw-config-models" % Version
  val `csw-config-models-tests` = "com.github.tmtsoftware.csw" %% "csw-config-models" % Version classifier "tests"

  val `csw-config-server`       = "com.github.tmtsoftware.csw" %% "csw-config-server" % Version
  val `csw-config-server-tests` = "com.github.tmtsoftware.csw" %% "csw-config-server" % Version classifier "tests"

  //====================== Logging =======================
  val `csw-logging-api`       = "com.github.tmtsoftware.csw" %% "csw-logging-api" % Version
  val `csw-logging-api-tests` = "com.github.tmtsoftware.csw" %% "csw-logging-api" % Version classifier "tests"

  val `csw-logging-models`       = "com.github.tmtsoftware.csw" %% "csw-logging-models" % Version
  val `csw-logging-models-tests` = "com.github.tmtsoftware.csw" %% "csw-logging-models" % Version classifier "tests"

  val `csw-logging-client`       = "com.github.tmtsoftware.csw" %% "csw-logging-client" % Version
  val `csw-logging-client-tests` = "com.github.tmtsoftware.csw" %% "csw-logging-client" % Version classifier "tests"

  //====================== Commons =======================
  val `csw-commons`       = "com.github.tmtsoftware.csw" %% "csw-commons" % Version
  val `csw-commons-tests` = "com.github.tmtsoftware.csw" %% "csw-commons" % Version classifier "tests"

  //====================== Network Utils =======================
  val `csw-network-utils`       = "com.github.tmtsoftware.csw" %% "csw-network-utils" % Version
  val `csw-network-utils-tests` = "com.github.tmtsoftware.csw" %% "csw-network-utils" % Version classifier "tests"

  //====================== Framework =======================
  val `csw-framework`           = "com.github.tmtsoftware.csw" %% "csw-framework" % Version
  val `csw-framework-tests`     = "com.github.tmtsoftware.csw" %% "csw-framework" % Version classifier "tests"
  val `csw-framework-multi-jvm` = "com.github.tmtsoftware.csw" %% "csw-framework" % Version classifier "multi-jvm"

  //====================== Command =======================
  val `csw-command-api`       = "com.github.tmtsoftware.csw" %% "csw-command-api" % Version
  val `csw-command-api-tests` = "com.github.tmtsoftware.csw" %% "csw-command-api" % Version classifier "tests"

  val `csw-command-client`       = "com.github.tmtsoftware.csw" %% "csw-command-client" % Version
  val `csw-command-client-tests` = "com.github.tmtsoftware.csw" %% "csw-command-client" % Version classifier "tests"

  //====================== Params =======================
  val `csw-params`       = "com.github.tmtsoftware.csw" %% "csw-params" % Version
  val `csw-params-tests` = "com.github.tmtsoftware.csw" %% "csw-params" % Version classifier "tests"

  //====================== Event =======================
  val `csw-event-api`       = "com.github.tmtsoftware.csw" %% "csw-event-api" % Version
  val `csw-event-api-tests` = "com.github.tmtsoftware.csw" %% "csw-event-api" % Version

  val `csw-event-cli`       = "com.github.tmtsoftware.csw" %% "csw-event-cli" % Version
  val `csw-event-cli-tests` = "com.github.tmtsoftware.csw" %% "csw-event-cli" % Version classifier "tests"

  val `csw-event-client`           = "com.github.tmtsoftware.csw" %% "csw-event-client" % Version
  val `csw-event-client-tests`     = "com.github.tmtsoftware.csw" %% "csw-event-client" % Version classifier "tests"
  val `csw-event-client-multi-jvm` = "com.github.tmtsoftware.csw" %% "csw-event-client" % Version classifier "multi-jvm"

  //====================== Alarm =======================
  val `csw-alarm-api`       = "com.github.tmtsoftware.csw" %% "csw-alarm-api" % Version
  val `csw-alarm-api-tests` = "com.github.tmtsoftware.csw" %% "csw-alarm-api" % Version classifier "tests"

  val `csw-alarm-models`      = "com.github.tmtsoftware.csw" %% "csw-alarm-models" % Version
  val `csw-alarm-models-test` = "com.github.tmtsoftware.csw" %% "csw-alarm-models" % Version classifier "tests"

  val `csw-alarm-client`       = "com.github.tmtsoftware.csw" %% "csw-alarm-client" % Version
  val `csw-alarm-client-tests` = "com.github.tmtsoftware.csw" %% "csw-alarm-client" % Version classifier "tests"

  val `csw-alarm-cli`       = "com.github.tmtsoftware.csw" %% "csw-alarm-cli" % Version
  val `csw-alarm-cli-tests` = "com.github.tmtsoftware.csw" %% "csw-alarm-cli" % Version classifier "tests"

  //====================== AAS =======================
  val `csw-aas-core`       = "com.github.tmtsoftware.csw" %% "csw-aas-core" % Version
  val `csw-aas-core-tests` = "com.github.tmtsoftware.csw" %% "csw-aas-core" % Version classifier "tests"

  val `csw-aas-http`           = "com.github.tmtsoftware.csw" %% "csw-aas-http" % Version
  val `csw-aas-http-tests`     = "com.github.tmtsoftware.csw" %% "csw-aas-http" % Version classifier "tests"
  val `csw-aas-http-multi-jvm` = "com.github.tmtsoftware.csw" %% "csw-aas-http" % Version classifier "multi-jvm"

  val `csw-aas-installed`       = "com.github.tmtsoftware.csw" %% "csw-aas-installed" % Version
  val `csw-aas-installed-tests` = "com.github.tmtsoftware.csw" %% "csw-aas-installed" % Version classifier "tests"

  //====================== Time =======================
  val `csw-time-core`       = "com.github.tmtsoftware.csw" %% "csw-time-core" % Version
  val `csw-time-core-tests` = "com.github.tmtsoftware.csw" %% "csw-time-core" % Version classifier "tests"

  val `csw-time-scheduler`       = "com.github.tmtsoftware.csw" %% "csw-time-scheduler" % Version
  val `csw-time-scheduler-tests` = "com.github.tmtsoftware.csw" %% "csw-time-scheduler" % Version classifier "tests"

  val `csw-time-clock`       = "com.github.tmtsoftware.csw" %% "csw-time-clock" % Version
  val `csw-time-clock-tests` = "com.github.tmtsoftware.csw" %% "csw-time-clock" % Version classifier "tests"

  //====================== Database =======================
  val `csw-database`       = "com.github.tmtsoftware.csw" %% "csw-database" % Version
  val `csw-database-tests` = "com.github.tmtsoftware.csw" %% "csw-database" % Version classifier "tests"

  //====================== Examples =======================
  val `examples`       = "com.github.tmtsoftware.csw" %% "examples" % Version
  val `examples-tests` = "com.github.tmtsoftware.csw" %% "examples" % Version classifier "tests"

  //====================== Testkit =======================
  val `csw-testkit`       = "com.github.tmtsoftware.csw" %% "csw-testkit" % Version
  val `csw-testkit-tests` = "com.github.tmtsoftware.csw" %% "csw-testkit" % Version classifier "tests"
}

object Akka {
  val Version                    = "2.6.1" //all akka is Apache License 2.0
  val `akka-actor`               = "com.typesafe.akka" %% "akka-actor" % Version
  val `akka-stream-testkit`      = "com.typesafe.akka" %% "akka-stream-testkit" % Version
  val `akka-actor-testkit-typed` = "com.typesafe.akka" %% "akka-actor-testkit-typed" % Version
  val `akka-multi-node-testkit`  = "com.typesafe.akka" %% "akka-multi-node-testkit" % Version
  val `akka-cluster-tools`       = "com.typesafe.akka" %% "akka-cluster-tools" % Version
  val `akka-cluster`             = "com.typesafe.akka" %% "akka-cluster" % Version
  val `akka-cluster-typed`       = "com.typesafe.akka" %% "akka-cluster-typed" % Version
}

object AkkaHttp {
  val Version                = "10.1.11"
  val `akka-http-testkit`    = "com.typesafe.akka" %% "akka-http-testkit" % Version //ApacheV2
  val `akka-http-spray-json` = "com.typesafe.akka" %% "akka-http-spray-json" % Version
}
