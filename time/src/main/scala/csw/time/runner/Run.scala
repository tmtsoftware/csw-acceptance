package csw.time.runner
import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val corePassed      = new AcceptanceTestRunner("csw-time-core").run()
  private val schedulerPassed = new AcceptanceTestRunner("csw-time-scheduler").run()
  private val clockPassed     = new AcceptanceTestRunner("csw-time-clock").run()

  if (corePassed && schedulerPassed && clockPassed) System.exit(0)
  else System.exit(1)
}
