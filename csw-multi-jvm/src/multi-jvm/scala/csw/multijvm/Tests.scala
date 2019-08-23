package csw.multijvm

import csw.config.client.ConfigServiceTest
import csw.config.{ConfigCliAppTest, ConfigCliAuthTest}
import csw.framework.command.{CancellableCommandTest, CommandServiceTest, LongRunningCommandTest}
import csw.framework.deploy.containercmd.ContainerCmdTest
import csw.location.{DetectAkkaComponentCrashTest, DetectComponentRestartTest, LocationServiceTest, TrackLocationTest}

// ========================================================
class LocationServiceTestMultiJvmNode1 extends LocationServiceTest(0, "cluster")
class LocationServiceTestMultiJvmNode2 extends LocationServiceTest(0, "cluster")

// ========================================================
class DetectAkkaComponentCrashTestMultiJvmNode1 extends DetectAkkaComponentCrashTest(0, "cluster")
class DetectAkkaComponentCrashTestMultiJvmNode2 extends DetectAkkaComponentCrashTest(0, "cluster")
class DetectAkkaComponentCrashTestMultiJvmNode3 extends DetectAkkaComponentCrashTest(0, "cluster")

// ========================================================
class DetectComponentRestartTestMultiJvmNode1 extends DetectComponentRestartTest(0, "cluster")
class DetectComponentRestartTestMultiJvmNode2 extends DetectComponentRestartTest(0, "cluster")
class DetectComponentRestartTestMultiJvmNode3 extends DetectComponentRestartTest(0, "cluster")

// ========================================================
class TrackLocationTestMultiJvmNode1 extends TrackLocationTest(0, "cluster")
class TrackLocationTestMultiJvmNode2 extends TrackLocationTest(0, "cluster")
class TrackLocationTestMultiJvmNode3 extends TrackLocationTest(0, "cluster")

// ========================================================
class ConfigCliAppTestMultiJvmNode1 extends ConfigCliAppTest(0)
class ConfigCliAppTestMultiJvmNode2 extends ConfigCliAppTest(0)
class ConfigCliAppTestMultiJvmNode3 extends ConfigCliAppTest(0)

// ========================================================
class ConfigCliAuthTestMultiJvmNode1 extends ConfigCliAuthTest(0)
class ConfigCliAuthTestMultiJvmNode2 extends ConfigCliAuthTest(0)
class ConfigCliAuthTestMultiJvmNode3 extends ConfigCliAuthTest(0)

// ========================================================
class ConfigServiceTestMultiJvmNode1 extends ConfigServiceTest(0)
class ConfigServiceTestMultiJvmNode2 extends ConfigServiceTest(0)

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
