package csw.location.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val api    = new AcceptanceTestRunner("csw-location-api").run()
  private val models = new AcceptanceTestRunner("csw-location-models").run()
  private val client = new AcceptanceTestRunner("csw-location-client").run()
  private val server = new AcceptanceTestRunner("csw-location-server").run()
  private val agent  = new AcceptanceTestRunner("csw-location-agent").run()

  if (api && models && client && server && agent) System.exit(0)
  else System.exit(1)
}
