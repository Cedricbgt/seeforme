package app.seeforme.platform.fake

import app.seeforme.platform.HapticEffect
import app.seeforme.platform.Haptics
import co.touchlab.kermit.Logger

class FakeHaptics : Haptics {
    private val log = Logger.withTag("FakeHaptics")

    override fun perform(effect: HapticEffect) {
        log.d { "perform: $effect" }
    }
}
