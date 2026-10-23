package app.seeforme.platform

/** Gives access to the device camera (or the webcam on desktop). */
interface Camera {
    /** Whether a camera exists and the app is allowed to use it. */
    val isAvailable: Boolean

    /** Captures a single frame, or returns `null` if capture failed. */
    suspend fun captureFrame(): CapturedImage?
}

/** An encoded image (JPEG or PNG) captured by a [Camera]. */
class CapturedImage(
    val bytes: ByteArray,
    val width: Int,
    val height: Int,
)
