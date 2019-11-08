package csw.event.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {

  private val cli    = new AcceptanceTestRunner("csw-event-cli").run()
  private val client = new AcceptanceTestRunner("csw-event-client").run()

  if (cli && client) System.exit(0)
  else System.exit(1)
}
