package csw.alarmapi.runner

import csw.acceptance.runner.AcceptanceTestRunner

object Run extends App {
  new AcceptanceTestRunner("csw-alarm-api").run(args)
}
