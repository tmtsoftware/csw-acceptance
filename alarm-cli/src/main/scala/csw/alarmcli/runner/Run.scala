package csw.alarmcli.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-alarm-cli").run(args)
}
