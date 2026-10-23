package app.seeforme.platform

/** Vibration feedback, so the user feels what is happening without looking. */
interface Haptics {
    fun perform(effect: HapticEffect)
}

enum class HapticEffect { Tap, Success, Warning }
