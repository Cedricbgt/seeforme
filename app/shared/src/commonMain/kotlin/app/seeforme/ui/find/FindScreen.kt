package app.seeforme.ui.find

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.seeforme.ui.components.PlaceholderScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun FindScreen(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    @Suppress("UnusedParameter") viewModel: FindViewModel = koinViewModel(),
) {
    PlaceholderScreen(
        title = "Find",
        actions = emptyList(),
        modifier = modifier,
        onBack = onBack,
    )
}
