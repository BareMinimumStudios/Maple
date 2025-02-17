package xyz.naomieow.maple.widgets

import net.minecraft.client.gui.components.AbstractWidget

abstract class Widget<T>(val children: Array<Widget<T>>) {
    var messagesToDispatch: MutableList<T> = mutableListOf()

    abstract fun getScreenWidget(): AbstractWidget

    fun collectMessages(): List<T> {
        var messages = messagesToDispatch
        messagesToDispatch = mutableListOf()
        children.forEach { messages + it.collectMessages() }
        return messages
    }

    fun xAlign(alignment: Alignment): Widget<T> {
        return this
    }

    fun yAlign(alignment: Alignment): Widget<T> {
        return this
    }
}