package app.seeforme.platform.fake

import app.seeforme.platform.Voice
import co.touchlab.kermit.Logger
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/** Logs the text instead of speaking it. */
class FakeVoice : Voice {
    private val log = Logger.withTag("FakeVoice")
    private val speaking = MutableStateFlow(false)

    override val isSpeaking: StateFlow<Boolean> = speaking.asStateFlow()

    override suspend fun speak(text: String) {
        speaking.value = true
        log.i { "speak: $text" }
        speaking.value = false
    }

    override fun stop() {
        speaking.value = false
    }
}
