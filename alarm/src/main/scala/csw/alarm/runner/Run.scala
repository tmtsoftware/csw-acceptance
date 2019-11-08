package csw.alarm.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val models = new AcceptanceTestRunner("csw-alarm-models").run()
  private val api    = new AcceptanceTestRunner("csw-alarm-api").run()
  private val cli    = new AcceptanceTestRunner("csw-alarm-cli").run()
  private val client = new AcceptanceTestRunner("csw-alarm-client").run()

  if (models && api && cli && client) System.exit(0)
  else System.exit(1)
}
