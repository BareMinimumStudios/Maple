package xyz.naomieow.maple

import net.minecraft.client.gui.screens.Screen
import net.minecraft.network.chat.Component
import xyz.naomieow.maple.widgets.Button
import xyz.naomieow.maple.widgets.Column
import xyz.naomieow.maple.widgets.Label
import xyz.naomieow.maple.widgets.Widget

abstract class Maple<T>(title: Component) : Screen(title) {
    abstract fun update(msg: T)
    abstract fun view(): Widget<T>

    constructor() : this(Component.empty())

    override fun init() {
        // TODO: Build initial UI state
        view()
        super.init()
    }

    override fun tick() {
        // Batch all messages dispatched this tick
        view().collectMessages().forEach { update(it) }
        super.tick()
    }

    /**
     * @param[label] The label that this button will show
     */
    fun button(label: Label<T>): Button<T> {
        return Button(label)
    }

    /**
     * @param[text] The text that this label will render
     */
    fun label(text: String): Label<T> {
        return Label(text)
    }

    /**
     * A layout primitive.
     *
     * [column] will automatically order [Widget]s passed to it
     * in a vertical manner.
     *
     * @param[children] A `vararg` of the children that will be
     * ordered in the column.
     */
    fun column(vararg children: Widget<T>): Column<T> {
        return Column(arrayOf(*children))
    }
}