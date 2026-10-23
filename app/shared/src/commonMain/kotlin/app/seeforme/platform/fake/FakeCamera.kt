package app.seeforme.platform.fake

import app.seeforme.platform.Camera
import app.seeforme.platform.CapturedImage
import co.touchlab.kermit.Logger

/** Pretends to capture an empty 1x1 frame. */
class FakeCamera : Camera {
    private val log = Logger.withTag("FakeCamera")

    override val isAvailable: Boolean = true

    override suspend fun captureFrame(): CapturedImage {
        log.d { "captureFrame()" }
        return CapturedImage(bytes = ByteArray(0), width = 1, height = 1)
    }
}
