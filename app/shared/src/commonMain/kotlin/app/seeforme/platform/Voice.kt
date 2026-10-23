package app.seeforme.platform

import kotlinx.coroutines.flow.StateFlow

/** Reads text aloud (text-to-speech). */
interface Voice {
    val isSpeaking: StateFlow<Boolean>

    /** Speaks [text] and suspends until it has been read entirely or [stop] is called. */
    suspend fun speak(text: String)

    fun stop()
}
