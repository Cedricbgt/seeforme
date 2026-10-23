package app.seeforme.platform.fake

import app.seeforme.platform.SpeechResult
import app.seeforme.platform.SpeechToText
import co.touchlab.kermit.Logger
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

/** Always "hears" the same question. */
class FakeSpeechToText : SpeechToText {
    private val log = Logger.withTag("FakeSpeechToText")

    override fun listen(): Flow<SpeechResult> {
        log.d { "listen()" }
        return flowOf(
            SpeechResult.Partial("What is"),
            SpeechResult.Final(CANNED_QUESTION),
        )
    }

    override fun stop() {
        log.d { "stop()" }
    }

    companion object {
        const val CANNED_QUESTION = "What is in front of me?"
    }
}
