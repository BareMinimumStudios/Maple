package xyz.naomieow.maple_testmod

import net.fabricmc.api.ClientModInitializer

class MapleTestmodFabric : ClientModInitializer {
    override fun onInitializeClient() {
        MapleTestmod.LOGGER.info("Hello from Fabric 1.20.1!")
    }
}