package csw.logging.runner
import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val api    = new AcceptanceTestRunner("csw-logging-api").run()
  private val models = new AcceptanceTestRunner("csw-logging-models").run()
  private val client = new AcceptanceTestRunner("csw-logging-client").run()

  if (api && models && client) System.exit(0)
  else System.exit(1)
}
