package csw.messages.runner
import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-messages").run(args)
}
