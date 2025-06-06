package xyz.naomieow.maple

private enum class EffectType {
    NONE,
}

class Effect<Msg> private constructor(private val type: EffectType) {
    companion object {
        fun <Msg> none(): Effect<Msg> {
            return Effect(EffectType.NONE)
        }
    }
}
