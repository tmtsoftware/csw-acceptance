package csw.configclient.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-config-client").run(args)
}
