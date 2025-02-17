package xyz.naomieow.maple.widgets

import net.minecraft.client.gui.components.AbstractWidget
import net.minecraft.client.gui.components.Button
import net.minecraft.network.chat.Component

class Button<T>(var label: Label<T>) : ClickableWidget<T>(arrayOf(label)) {
    override fun getScreenWidget(): AbstractWidget {
        return Button.builder(
            Component.literal(label.text)
        ) { dispatchClick() }.build()
    }
}