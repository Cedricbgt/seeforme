package app.seeforme.di

import app.seeforme.platform.A11yAnnouncer
import app.seeforme.platform.Camera
import app.seeforme.platform.Haptics
import app.seeforme.platform.SpeechToText
import app.seeforme.platform.Voice
import org.koin.dsl.koinApplication
import kotlin.test.Test
import kotlin.test.assertNotNull

class AppModulesTest {
    @Test
    fun platformServicesResolve() {
        val koin = koinApplication { modules(appModules) }.koin
        try {
            assertNotNull(koin.getOrNull<Camera>())
            assertNotNull(koin.getOrNull<SpeechToText>())
            assertNotNull(koin.getOrNull<Voice>())
            assertNotNull(koin.getOrNull<Haptics>())
            assertNotNull(koin.getOrNull<A11yAnnouncer>())
        } finally {
            koin.close()
        }
    }
}
