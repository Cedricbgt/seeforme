package app.seeforme.ui.answer

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.seeforme.ui.components.PlaceholderAction
import app.seeforme.ui.components.PlaceholderScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun AnswerScreen(
    onNewQuestion: () -> Unit,
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    @Suppress("UnusedParameter") viewModel: AnswerViewModel = koinViewModel(),
) {
    PlaceholderScreen(
        title = "Answer",
        actions =
            listOf(
                PlaceholderAction("New question", onNewQuestion),
            ),
        modifier = modifier,
        onBack = onBack,
    )
}
