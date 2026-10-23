package app.seeforme.platform

import kotlinx.coroutines.flow.Flow

/** Turns what the user says into text. */
interface SpeechToText {
    /** Starts listening; the flow completes after a [SpeechResult.Final] or a [SpeechResult.Error]. */
    fun listen(): Flow<SpeechResult>

    /** Stops listening early. */
    fun stop()
}

sealed interface SpeechResult {
    /** Text recognised so far, which may still change. */
    data class Partial(
        val text: String,
    ) : SpeechResult

    /** The final transcript of what the user said. */
    data class Final(
        val text: String,
    ) : SpeechResult

    data class Error(
        val message: String,
    ) : SpeechResult
}
