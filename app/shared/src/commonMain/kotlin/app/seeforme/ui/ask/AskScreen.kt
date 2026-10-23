package app.seeforme.ui.ask

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.seeforme.ui.components.PlaceholderAction
import app.seeforme.ui.components.PlaceholderScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun AskScreen(
    onStartListening: () -> Unit,
    onOpenFind: () -> Unit,
    onOpenHistory: () -> Unit,
    onOpenSettings: () -> Unit,
    modifier: Modifier = Modifier,
    @Suppress("UnusedParameter") viewModel: AskViewModel = koinViewModel(),
) {
    PlaceholderScreen(
        title = "Ask",
        actions =
            listOf(
                PlaceholderAction("Ask a question", onStartListening),
                PlaceholderAction("Find something", onOpenFind),
                PlaceholderAction("History", onOpenHistory),
                PlaceholderAction("Settings", onOpenSettings),
            ),
        modifier = modifier,
    )
}
