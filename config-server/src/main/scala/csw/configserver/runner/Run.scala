package csw.configserver.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-config-server").run(args)
}
