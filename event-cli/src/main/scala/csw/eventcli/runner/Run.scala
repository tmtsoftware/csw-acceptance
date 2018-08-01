package csw.eventcli.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-event-cli").run(args)
}
