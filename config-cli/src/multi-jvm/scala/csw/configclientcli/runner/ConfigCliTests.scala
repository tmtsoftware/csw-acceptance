package csw.configclientcli.runner

import csw.config.{ConfigCliAppTest, ConfigCliAuthTest}

class ConfigCliAppTestMultiJvmNode1 extends ConfigCliAppTest(0)
class ConfigCliAppTestMultiJvmNode2 extends ConfigCliAppTest(0)
class ConfigCliAppTestMultiJvmNode3 extends ConfigCliAppTest(0)

class ConfigCliAuthTestMultiJvmNode1 extends ConfigCliAuthTest(0)
class ConfigCliAuthTestMultiJvmNode2 extends ConfigCliAuthTest(0)
class ConfigCliAuthTestMultiJvmNode3 extends ConfigCliAuthTest(0)
