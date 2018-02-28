package csw.configclientcli.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-config-client-cli").run(args)
}
