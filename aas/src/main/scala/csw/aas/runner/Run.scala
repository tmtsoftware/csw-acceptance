package csw.aas.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  private val corePassed      = new AcceptanceTestRunner("csw-aas-core").run()
  private val installedPassed = new AcceptanceTestRunner("csw-aas-installed").run()
  private val httpPassed      = new AcceptanceTestRunner("csw-aas-http").run()

  if (corePassed && installedPassed && httpPassed) System.exit(0)
  else System.exit(1)
}
