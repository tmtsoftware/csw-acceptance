package csw.clusterseed.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-cluster-seed").run(args)
}
