package csw.locationagent.runner
import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-location-agent").run(args)
}
