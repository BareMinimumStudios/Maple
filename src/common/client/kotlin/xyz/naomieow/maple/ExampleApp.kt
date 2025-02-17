package xyz.naomieow.maple

import net.minecraft.network.chat.Component
import xyz.naomieow.maple.widgets.Alignment
import xyz.naomieow.maple.widgets.Widget

enum class Msg {
    INCREMENT,
    DECREMENT,
}

class ExampleApp : Maple<Msg>(
    title = Component.literal("Example Screen")
) {
    var counter: Int = 0

    override fun update(msg: Msg) {
        when (msg) {
            Msg.INCREMENT -> counter += 1
            Msg.DECREMENT -> counter -= 1
        }
    }

    override fun view(): Widget<Msg> {
        return column(
            button(label("+")).onClick(Msg.INCREMENT),
            label("$counter"),
            button(label("-")).onClick(Msg.DECREMENT),
        ).xAlign(Alignment.CENTER)
        .yAlign(Alignment.CENTER)
    }
}
