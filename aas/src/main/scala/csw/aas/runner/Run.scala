package csw.aas.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val core      = new AcceptanceTestRunner("csw-aas-core").run()
  private val installed = new AcceptanceTestRunner("csw-aas-installed").run()
  private val http      = new AcceptanceTestRunner("csw-aas-http").run()

  if (core && installed && http) System.exit(0)
  else System.exit(1)
}
