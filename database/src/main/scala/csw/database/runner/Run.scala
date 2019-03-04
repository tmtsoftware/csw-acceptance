package csw.database.runner
import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  // Fixme: This fails
  new AcceptanceTestRunner("csw-database").run(args)
}
