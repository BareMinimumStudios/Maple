package xyz.naomieow.maple

import xyz.naomieow.maple.widgets.Column
import xyz.naomieow.maple.widgets.Widget

abstract class Maple<Msg> {

    abstract fun init(): Effect<Msg>
    abstract fun update(msg: Msg): Effect<Msg>
    abstract fun view(): Widget<Msg>

    fun column(vararg children: Widget<Msg>): Widget<Msg> {
        return Column(arrayOf(*children))
    }
}
