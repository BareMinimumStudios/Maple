package xyz.naomieow.maple.widgets

import net.minecraft.client.gui.components.AbstractWidget
import net.minecraft.client.gui.components.Button
import net.minecraft.network.chat.Component

open class ClickableWidget<T>(children: Array<Widget<T>>) : Widget<T>(children) {
    var onClickCallback: (() -> T)? = null

    fun onClick(msg: T): Widget<T> {
        onClickCallback = { msg }
        return this
    }

    fun dispatchClick() {
        onClickCallback?.let {
            messagesToDispatch.add(it())
        }
    }

    override fun getScreenWidget(): AbstractWidget {
        return Button.builder(
            Component.empty()
        ) { dispatchClick() }.build()
    }
}