package app.seeforme.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

// Calm palette (default).
internal val CalmBackground = Color(0xFFF3F5F9)
internal val CalmSurface = Color(0xFFFFFFFF)
internal val CalmOnSurface = Color(0xFF0E1A2B)
internal val CalmMuted = Color(0xFF4A5568)
internal val CalmPrimary = Color(0xFF2443E0)
internal val CalmPrimaryContainer = Color(0xFFE3E8FF)
internal val CalmOnPrimaryContainer = Color(0xFF14267F)
internal val CalmPlaceholder = Color(0xFFDDE2EA)
internal val CalmOutline = Color(0xFFCBD2DC)
internal val CalmError = Color(0xFFB42318)

// High contrast palette.
internal val HighContrastBackground = Color(0xFF000000)
internal val HighContrastText = Color(0xFFFFFFFF)
internal val HighContrastAccent = Color(0xFFFFD60A)
internal val HighContrastPlaceholder = Color(0xFF262626)
internal val HighContrastError = Color(0xFFFF8A80)

/** Design tokens that have no Material 3 equivalent. */
@Immutable
data class SeeForMeColors(
    val muted: Color,
    val placeholder: Color,
)

internal val CalmColors =
    SeeForMeColors(
        muted = CalmMuted,
        placeholder = CalmPlaceholder,
    )

internal val HighContrastColors =
    SeeForMeColors(
        muted = HighContrastText,
        placeholder = HighContrastPlaceholder,
    )

internal val CalmColorScheme: ColorScheme =
    lightColorScheme(
        primary = CalmPrimary,
        onPrimary = CalmSurface,
        primaryContainer = CalmPrimaryContainer,
        onPrimaryContainer = CalmOnPrimaryContainer,
        background = CalmBackground,
        onBackground = CalmOnSurface,
        surface = CalmSurface,
        onSurface = CalmOnSurface,
        surfaceVariant = CalmPlaceholder,
        onSurfaceVariant = CalmMuted,
        outline = CalmOutline,
        outlineVariant = CalmOutline,
        error = CalmError,
        onError = CalmSurface,
    )

internal val HighContrastColorScheme: ColorScheme =
    darkColorScheme(
        primary = HighContrastAccent,
        onPrimary = HighContrastBackground,
        primaryContainer = HighContrastAccent,
        onPrimaryContainer = HighContrastBackground,
        background = HighContrastBackground,
        onBackground = HighContrastText,
        surface = HighContrastBackground,
        onSurface = HighContrastText,
        surfaceVariant = HighContrastPlaceholder,
        onSurfaceVariant = HighContrastText,
        outline = HighContrastText,
        outlineVariant = HighContrastText,
        error = HighContrastError,
        onError = HighContrastBackground,
    )
