package app.seeforme.ui.welcome

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.seeforme.ui.components.PlaceholderAction
import app.seeforme.ui.components.PlaceholderScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun WelcomeScreen(
    onGetStarted: () -> Unit,
    onOpenSettings: () -> Unit,
    modifier: Modifier = Modifier,
    @Suppress("UnusedParameter") viewModel: WelcomeViewModel = koinViewModel(),
) {
    PlaceholderScreen(
        title = "Welcome",
        actions =
            listOf(
                PlaceholderAction("Get started", onGetStarted),
                PlaceholderAction("Settings", onOpenSettings),
            ),
        modifier = modifier,
    )
}
