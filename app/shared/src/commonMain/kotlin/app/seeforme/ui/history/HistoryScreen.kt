package app.seeforme.ui.history

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.seeforme.ui.components.PlaceholderAction
import app.seeforme.ui.components.PlaceholderScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HistoryScreen(
    onOpenAnswer: () -> Unit,
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    @Suppress("UnusedParameter") viewModel: HistoryViewModel = koinViewModel(),
) {
    PlaceholderScreen(
        title = "History",
        actions =
            listOf(
                PlaceholderAction("Open last answer", onOpenAnswer),
            ),
        modifier = modifier,
        onBack = onBack,
    )
}
