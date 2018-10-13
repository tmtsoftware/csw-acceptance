package csw.locationserver.runner
import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-location-server").run(args)
}
