package xyz.naomieow.maple.widgets

import net.minecraft.client.gui.components.AbstractWidget

class Column<T>(children: Array<Widget<T>>) : Widget<T>(children) {
    override fun getScreenWidget(): AbstractWidget {
        TODO("Not yet implemented")
    }
}