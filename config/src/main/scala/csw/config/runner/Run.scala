package csw.config.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val models = new AcceptanceTestRunner("csw-config-models").run()
  private val api    = new AcceptanceTestRunner("csw-config-api").run()
  private val cli    = new AcceptanceTestRunner("csw-config-cli").run()
  private val client = new AcceptanceTestRunner("csw-config-client").run()
  private val server = new AcceptanceTestRunner("csw-config-server").run()

  if (models && api && cli && client && server) System.exit(0)
  else System.exit(1)
}
