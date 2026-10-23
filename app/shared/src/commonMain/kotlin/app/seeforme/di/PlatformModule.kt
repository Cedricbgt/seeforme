package app.seeforme.di

import app.seeforme.platform.A11yAnnouncer
import app.seeforme.platform.Camera
import app.seeforme.platform.Haptics
import app.seeforme.platform.SpeechToText
import app.seeforme.platform.Voice
import app.seeforme.platform.fake.FakeA11yAnnouncer
import app.seeforme.platform.fake.FakeCamera
import app.seeforme.platform.fake.FakeHaptics
import app.seeforme.platform.fake.FakeSpeechToText
import app.seeforme.platform.fake.FakeVoice
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

/** Fake implementations until the real platform ones exist. */
val platformModule =
    module {
        singleOf(::FakeCamera) bind Camera::class
        singleOf(::FakeSpeechToText) bind SpeechToText::class
        singleOf(::FakeVoice) bind Voice::class
        singleOf(::FakeHaptics) bind Haptics::class
        singleOf(::FakeA11yAnnouncer) bind A11yAnnouncer::class
    }
