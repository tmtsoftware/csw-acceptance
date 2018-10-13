package csw.alarmclient.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-alarm-client").run(args)
}
