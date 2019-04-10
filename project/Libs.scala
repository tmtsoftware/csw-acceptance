import sbt._

object Libs {
  val ScalaVersion = "2.12.7"

  val `scalatest`                = "org.scalatest"            %% "scalatest"                % "3.0.5" //Apache License 2.0
  val `junit`                    = "junit"                    % "junit"                     % "4.12" //Eclipse Public License 1.0
  val `junit-interface`          = "com.novocode"             % "junit-interface"           % "0.11" //BSD 2-clause "Simplified" License
  val `mockito-scala`            = "org.mockito"              %% "mockito-scala"            % "1.2.1"
  val `scalatest-embedded-kafka` = "net.manub"                %% "scalatest-embedded-kafka" % "1.1.0"
  val `embedded-redis`           = "com.github.kstyrc"        % "embedded-redis"            % "0.6"
  val `otj-pg-embedded`          = "com.opentable.components" % "otj-pg-embedded"           % "0.13.1"
  val `testng`                   = "org.testng"               % "testng"                    % "6.14.3"
  val `gson`                     = "com.google.code.gson"     % "gson"                      % "2.8.5" //Apache 2.0
}

object Chill {
  val Version           = "0.9.3"
  val `chill-akka`      = "com.twitter" %% "chill-akka" % Version //Apache License 2.0
  val `chill-bijection` = "com.twitter" %% "chill-bijection" % Version //Apache License 2.0
}

object CSW {
  val Version: String = {
    val env = sys.env ++ sys.props
    env.getOrElse("CSW_VERSION", "0.1-SNAPSHOT")
  }

  val `csw-admin-server`       = "com.github.tmtsoftware.csw" %% "csw-admin-server" % Version
  val `csw-admin-server-tests` = "com.github.tmtsoftware.csw" %% "csw-admin-server" % Version classifier "tests"

  val `csw-location-server`       = "com.github.tmtsoftware.csw" %% "csw-location-server" % Version
  val `csw-location-server-tests` = "com.github.tmtsoftware.csw" %% "csw-location-server" % Version classifier "tests"

  val `csw-location-client`       = "com.github.tmtsoftware.csw" %% "csw-location-client" % Version
  val `csw-location-client-tests` = "com.github.tmtsoftware.csw" %% "csw-location-client" % Version classifier "tests"

  val `csw-config-server`       = "com.github.tmtsoftware.csw" %% "csw-config-server" % Version
  val `csw-config-server-tests` = "com.github.tmtsoftware.csw" %% "csw-config-server" % Version classifier "tests"

  val `csw-config-api`       = "com.github.tmtsoftware.csw" %% "csw-config-api" % Version
  val `csw-config-api-tests` = "com.github.tmtsoftware.csw" %% "csw-config-api" % Version classifier "tests"

  val `csw-config-client`       = "com.github.tmtsoftware.csw" %% "csw-config-client" % Version
  val `csw-config-client-tests` = "com.github.tmtsoftware.csw" %% "csw-config-client" % Version classifier "tests"

  val `csw-config-cli`       = "com.github.tmtsoftware.csw" %% "csw-config-cli" % Version
  val `csw-config-cli-tests` = "com.github.tmtsoftware.csw" %% "csw-config-cli" % Version classifier "tests"

  val `csw-logging`       = "com.github.tmtsoftware.csw" %% "csw-logging-client" % Version
  val `csw-logging-tests` = "com.github.tmtsoftware.csw" %% "csw-logging-client" % Version classifier "tests"

  val `csw-commons`       = "com.github.tmtsoftware.csw" %% "csw-commons" % Version
  val `csw-commons-tests` = "com.github.tmtsoftware.csw" %% "csw-commons" % Version classifier "tests"

  val `csw-network-utils`       = "com.github.tmtsoftware.csw" %% "csw-network-utils" % Version
  val `csw-network-utils-tests` = "com.github.tmtsoftware.csw" %% "csw-network-utils" % Version classifier "tests"

  val `csw-framework`       = "com.github.tmtsoftware.csw" %% "csw-framework" % Version
  val `csw-framework-tests` = "com.github.tmtsoftware.csw" %% "csw-framework" % Version classifier "tests"

  val `csw-command-client`       = "com.github.tmtsoftware.csw" %% "csw-command-client" % Version
  val `csw-command-client-tests` = "com.github.tmtsoftware.csw" %% "csw-command-client" % Version classifier "tests"

  val `csw-params`       = "com.github.tmtsoftware.csw" %% "csw-params" % Version
  val `csw-params-tests` = "com.github.tmtsoftware.csw" %% "csw-params" % Version classifier "tests"

  val `csw-location-agent`       = "com.github.tmtsoftware.csw" %% "csw-location-agent" % Version
  val `csw-location-agent-tests` = "com.github.tmtsoftware.csw" %% "csw-location-agent" % Version classifier "tests"

  val `csw-event-api` = "com.github.tmtsoftware.csw" %% "csw-event-api" % Version

  val `csw-event-client`       = "com.github.tmtsoftware.csw" %% "csw-event-client" % Version
  val `csw-event-client-tests` = "com.github.tmtsoftware.csw" %% "csw-event-client" % Version classifier "tests"

  val `csw-event-cli`       = "com.github.tmtsoftware.csw" %% "csw-event-cli" % Version
  val `csw-event-cli-tests` = "com.github.tmtsoftware.csw" %% "csw-event-cli" % Version classifier "tests"

  val `csw-alarm-api`       = "com.github.tmtsoftware.csw" %% "csw-alarm-api" % Version
  val `csw-alarm-api-tests` = "com.github.tmtsoftware.csw" %% "csw-alarm-api" % Version classifier "tests"

  val `csw-alarm-client`       = "com.github.tmtsoftware.csw" %% "csw-alarm-client" % Version
  val `csw-alarm-client-tests` = "com.github.tmtsoftware.csw" %% "csw-alarm-client" % Version classifier "tests"

  val `csw-alarm-cli`       = "com.github.tmtsoftware.csw" %% "csw-alarm-cli" % Version
  val `csw-alarm-cli-tests` = "com.github.tmtsoftware.csw" %% "csw-alarm-cli" % Version classifier "tests"

  val `csw-aas-core`       = "com.github.tmtsoftware.csw" %% "csw-aas-core" % Version
  val `csw-aas-core-tests` = "com.github.tmtsoftware.csw" %% "csw-aas-core" % Version classifier "tests"

  val `csw-aas-http`       = "com.github.tmtsoftware.csw" %% "csw-aas-http" % Version
  val `csw-aas-http-tests` = "com.github.tmtsoftware.csw" %% "csw-aas-http" % Version classifier "tests"

  val `csw-aas-installed`       = "com.github.tmtsoftware.csw" %% "csw-aas-installed" % Version
  val `csw-aas-installed-tests` = "com.github.tmtsoftware.csw" %% "csw-aas-installed" % Version classifier "tests"

  val `csw-time-core`       = "com.github.tmtsoftware.csw" %% "csw-time-core" % Version
  val `csw-time-core-tests` = "com.github.tmtsoftware.csw" %% "csw-time-core" % Version classifier "tests"

  val `csw-time-scheduler`       = "com.github.tmtsoftware.csw" %% "csw-time-scheduler" % Version
  val `csw-time-scheduler-tests` = "com.github.tmtsoftware.csw" %% "csw-time-scheduler" % Version classifier "tests"

  val `csw-time-clock`       = "com.github.tmtsoftware.csw" %% "csw-time-clock" % Version
  val `csw-time-clock-tests` = "com.github.tmtsoftware.csw" %% "csw-time-clock" % Version classifier "tests"

  val `csw-database`       = "com.github.tmtsoftware.csw" %% "csw-database" % Version
  val `csw-database-tests` = "com.github.tmtsoftware.csw" %% "csw-database" % Version classifier "tests"
}

object Akka {
  val Version                    = "2.5.22" //all akka is Apache License 2.0
  val `akka-actor`               = "com.typesafe.akka" %% "akka-actor" % Version
  val `akka-stream-testkit`      = "com.typesafe.akka" %% "akka-stream-testkit" % Version
  val `akka-actor-testkit-typed` = "com.typesafe.akka" %% "akka-actor-testkit-typed" % Version
  val `akka-multi-node-testkit`  = "com.typesafe.akka" %% "akka-multi-node-testkit" % Version
}

object AkkaHttp {
  val Version             = "10.1.8"
  val `akka-http-testkit` = "com.typesafe.akka" %% "akka-http-testkit" % Version //ApacheV2
}

object Coursier {
  val Version          = "1.1.0-M13-2"
  val `coursier`       = "io.get-coursier" %% "coursier" % Version
  val `coursier-cache` = "io.get-coursier" %% "coursier-cache" % Version
}
