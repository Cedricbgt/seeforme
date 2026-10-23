package app.seeforme.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.FontFamily

enum class ThemeVariant { Calm, HighContrast }

private val LocalSeeForMeColors = staticCompositionLocalOf { CalmColors }

/** Accessors for the SeeForMe tokens that [MaterialTheme] does not carry. */
object SeeForMeTheme {
    val colors: SeeForMeColors
        @Composable
        @ReadOnlyComposable
        get() = LocalSeeForMeColors.current
}

@Composable
fun SeeForMeTheme(
    variant: ThemeVariant = ThemeVariant.Calm,
    content: @Composable () -> Unit,
) {
    when (variant) {
        ThemeVariant.Calm -> CalmTheme(content)
        ThemeVariant.HighContrast -> HighContrastTheme(content)
    }
}

@Composable
fun CalmTheme(content: @Composable () -> Unit) {
    SeeForMeMaterialTheme(CalmColorScheme, CalmColors, lexendFontFamily(), content)
}

@Composable
fun HighContrastTheme(content: @Composable () -> Unit) {
    SeeForMeMaterialTheme(
        HighContrastColorScheme,
        HighContrastColors,
        atkinsonHyperlegibleFontFamily(),
        content,
    )
}

@Composable
private fun SeeForMeMaterialTheme(
    colorScheme: ColorScheme,
    colors: SeeForMeColors,
    fontFamily: FontFamily,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalSeeForMeColors provides colors,
        LocalMinimumInteractiveComponentSize provides Dimens.MinTouchTarget,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = seeForMeTypography(fontFamily),
            shapes = SeeForMeShapes,
            content = content,
        )
    }
}
