package csw.framework.runner

import csw.framework.command.CancellableCommandTest
import csw.framework.deploy.containercmd.ContainerCmdTest
import csw.framework.command.CommandServiceTest
import csw.framework.command.LongRunningCommandTest

// ========================================================
class CancellableCommandTestMultiJvm1 extends CancellableCommandTest(0)
class CancellableCommandTestMultiJvm2 extends CancellableCommandTest(0)

// ========================================================
class CommandServiceTestMultiJvm1 extends CommandServiceTest(0)
class CommandServiceTestMultiJvm2 extends CommandServiceTest(0)
class CommandServiceTestMultiJvm3 extends CommandServiceTest(0)

// ========================================================
class ContainerCmdTestMultiJvm1 extends ContainerCmdTest(0)
class ContainerCmdTestMultiJvm2 extends ContainerCmdTest(0)
class ContainerCmdTestMultiJvm3 extends ContainerCmdTest(0)

// ========================================================
class LongRunningCommandTestMultiJvm1 extends LongRunningCommandTest(0)
class LongRunningCommandTestMultiJvm2 extends LongRunningCommandTest(0)
class LongRunningCommandTestMultiJvm3 extends LongRunningCommandTest(0)
