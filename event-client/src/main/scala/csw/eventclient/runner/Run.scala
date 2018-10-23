package csw.eventclient.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-event-client").run(args)
}
