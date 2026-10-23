package app.seeforme.platform.fake

import app.seeforme.platform.A11yAnnouncer
import co.touchlab.kermit.Logger

class FakeA11yAnnouncer : A11yAnnouncer {
    private val log = Logger.withTag("FakeA11yAnnouncer")

    override fun announce(message: String) {
        log.i { "announce: $message" }
    }
}
