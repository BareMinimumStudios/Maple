package xyz.naomieow.maple

import net.fabricmc.api.ClientModInitializer

class MapleFabricClient: ClientModInitializer {
    override fun onInitializeClient() {
        MapleClient.LOGGER.info("Hello from MAPLE fabric client!")
    }
}