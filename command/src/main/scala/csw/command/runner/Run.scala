package csw.command.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val api    = new AcceptanceTestRunner("csw-command-api").run()
  private val client = new AcceptanceTestRunner("csw-command-client").run()

  if (api && client) System.exit(0)
  else System.exit(1)
}
