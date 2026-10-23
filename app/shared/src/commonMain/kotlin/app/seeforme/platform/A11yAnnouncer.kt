package app.seeforme.platform

/** Sends messages to the platform screen reader (TalkBack, VoiceOver, NVDA...). */
interface A11yAnnouncer {
    fun announce(message: String)
}
