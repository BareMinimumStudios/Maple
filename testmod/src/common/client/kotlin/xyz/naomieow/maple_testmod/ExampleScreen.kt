package xyz.naomieow.maple_testmod

import xyz.naomieow.maple.Effect
import xyz.naomieow.maple.Maple
import xyz.naomieow.maple.widgets.Widget

sealed interface Msg {
    data class INCREMENT(val value: Int) : Msg
    data class DECREMENT(val value: Int) : Msg
}

class ExampleScreen : Maple<Msg>() {
    var counter: Int = 0

    override fun init(): Effect<Msg> {
        return Effect.none()
    }

    override fun update(msg: Msg): Effect<Msg> {
        when (msg) {
            is Msg.INCREMENT -> {
                counter += msg.value
                return Effect.none()
            }
            is Msg.DECREMENT -> {
                counter -= msg.value
                return Effect.none()
            }
        }
    }

    override fun view(): Widget<Msg> {
        return column()
    }
}
