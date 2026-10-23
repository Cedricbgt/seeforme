package app.seeforme.ui.settings

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.seeforme.ui.components.PlaceholderScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SettingsScreen(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    @Suppress("UnusedParameter") viewModel: SettingsViewModel = koinViewModel(),
) {
    PlaceholderScreen(
        title = "Settings",
        actions = emptyList(),
        modifier = modifier,
        onBack = onBack,
    )
}
