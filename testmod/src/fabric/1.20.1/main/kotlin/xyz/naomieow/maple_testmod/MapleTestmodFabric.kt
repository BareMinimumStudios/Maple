package xyz.naomieow.maple_testmod

import net.fabricmc.api.ModInitializer
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import java.util.logging.Logger

object MapleTestmodFabric : ModInitializer {
    @JvmStatic
    public val MOD_ID: String = "maple_testmod"

    @JvmStatic
    public var LOGGER: Logger = Logger.getLogger(MOD_ID)

    override fun onInitialize() {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation(MOD_ID, "test_item"), Item(Item.Properties()))

        LOGGER.info("Hello from Fabric 1.20.1!")
    }
}