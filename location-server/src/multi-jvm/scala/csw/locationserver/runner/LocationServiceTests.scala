package csw.locationserver.runner

import csw.location.DetectComponentRestartTest
import csw.location.TrackLocationTest
import csw.location.DetectAkkaComponentCrashTest
import csw.location.LocationServiceTest

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
