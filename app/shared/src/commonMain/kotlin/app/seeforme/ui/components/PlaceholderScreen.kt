package app.seeforme.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import app.seeforme.ui.theme.Dimens

/** Temporary screen body: a heading and one button per reachable screen. */
@Composable
fun PlaceholderScreen(
    title: String,
    actions: List<PlaceholderAction>,
    modifier: Modifier = Modifier,
    onBack: (() -> Unit)? = null,
) {
    Column(
        modifier =
            modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .safeDrawingPadding()
                .padding(Dimens.ScreenPadding),
        verticalArrangement = Arrangement.spacedBy(Dimens.SpacingMedium),
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.semantics { heading() },
        )
        actions.forEach { action ->
            Button(
                onClick = action.onClick,
                modifier = Modifier.fillMaxWidth().heightIn(min = Dimens.MinTouchTarget),
            ) {
                Text(action.label)
            }
        }
        if (onBack != null) {
            OutlinedButton(
                onClick = onBack,
                modifier = Modifier.fillMaxWidth().heightIn(min = Dimens.MinTouchTarget),
            ) {
                Text("Back")
            }
        }
    }
}
