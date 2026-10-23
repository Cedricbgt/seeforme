package app.seeforme.ui.listening

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.seeforme.ui.components.PlaceholderAction
import app.seeforme.ui.components.PlaceholderScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ListeningScreen(
    onAnswerReady: () -> Unit,
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    @Suppress("UnusedParameter") viewModel: ListeningViewModel = koinViewModel(),
) {
    PlaceholderScreen(
        title = "Listening",
        actions =
            listOf(
                PlaceholderAction("Show answer", onAnswerReady),
            ),
        modifier = modifier,
        onBack = onBack,
    )
}
