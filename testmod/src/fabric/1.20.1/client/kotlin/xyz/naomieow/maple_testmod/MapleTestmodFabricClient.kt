package xyz.naomieow.maple_testmod

import net.fabricmc.api.ClientModInitializer
import java.util.logging.Logger

object MapleTestmodFabricClient : ClientModInitializer {
    @JvmStatic
    public val MOD_ID: String = "maple_testmod"

    @JvmStatic
    public var LOGGER: Logger = Logger.getLogger(MOD_ID)

    override fun onInitializeClient() {
        LOGGER.info("Hello from Fabric 1.20.1 Client!")
    }
}