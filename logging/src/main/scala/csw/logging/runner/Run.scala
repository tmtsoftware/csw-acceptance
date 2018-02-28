package csw.logging.runner
import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-logging").run(args)
}
