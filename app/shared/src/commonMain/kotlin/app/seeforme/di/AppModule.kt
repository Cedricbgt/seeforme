package app.seeforme.di

import app.seeforme.ui.answer.AnswerViewModel
import app.seeforme.ui.ask.AskViewModel
import app.seeforme.ui.find.FindViewModel
import app.seeforme.ui.history.HistoryViewModel
import app.seeforme.ui.listening.ListeningViewModel
import app.seeforme.ui.settings.SettingsViewModel
import app.seeforme.ui.welcome.WelcomeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule =
    module {
        viewModelOf(::WelcomeViewModel)
        viewModelOf(::AskViewModel)
        viewModelOf(::ListeningViewModel)
        viewModelOf(::AnswerViewModel)
        viewModelOf(::FindViewModel)
        viewModelOf(::HistoryViewModel)
        viewModelOf(::SettingsViewModel)
    }

val appModules = listOf(platformModule, viewModelModule)
