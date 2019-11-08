package csw.time.runner
import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val core      = new AcceptanceTestRunner("csw-time-core").run()
  private val scheduler = new AcceptanceTestRunner("csw-time-scheduler").run()
  private val clock     = new AcceptanceTestRunner("csw-time-clock").run()

  if (core && scheduler && clock) System.exit(0)
  else System.exit(1)
}
