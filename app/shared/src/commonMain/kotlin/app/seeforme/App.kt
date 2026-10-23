package app.seeforme

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.seeforme.di.appModules
import app.seeforme.ui.navigation.SeeForMeNavHost
import app.seeforme.ui.theme.SeeForMeTheme
import org.koin.compose.KoinMultiplatformApplication
import org.koin.dsl.koinConfiguration

@Composable
@Preview
fun App() {
    KoinMultiplatformApplication(config = koinConfiguration { modules(appModules) }) {
        SeeForMeTheme {
            SeeForMeNavHost()
        }
    }
}
