package app.seeforme.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import seeforme.app.shared.generated.resources.Res
import seeforme.app.shared.generated.resources.atkinson_hyperlegible_bold
import seeforme.app.shared.generated.resources.atkinson_hyperlegible_regular
import seeforme.app.shared.generated.resources.lexend_medium
import seeforme.app.shared.generated.resources.lexend_regular
import seeforme.app.shared.generated.resources.lexend_semibold

@Composable
internal fun lexendFontFamily(): FontFamily =
    FontFamily(
        Font(Res.font.lexend_regular, FontWeight.Normal),
        Font(Res.font.lexend_medium, FontWeight.Medium),
        Font(Res.font.lexend_semibold, FontWeight.SemiBold),
    )

/** Atkinson Hyperlegible only ships 400 and 700: medium and semibold resolve to bold. */
@Composable
internal fun atkinsonHyperlegibleFontFamily(): FontFamily =
    FontFamily(
        Font(Res.font.atkinson_hyperlegible_regular, FontWeight.Normal),
        Font(Res.font.atkinson_hyperlegible_bold, FontWeight.Bold),
    )

private val Title = TextStyle(fontSize = 28.sp, lineHeight = 34.sp, fontWeight = FontWeight.SemiBold)
private val Body = TextStyle(fontSize = 17.sp, lineHeight = 24.sp, fontWeight = FontWeight.Normal)
private val Label = TextStyle(fontSize = 17.sp, lineHeight = 24.sp, fontWeight = FontWeight.Medium)
private val Caption = TextStyle(fontSize = 14.sp, lineHeight = 20.sp, fontWeight = FontWeight.Normal)

/** Title 28sp, body 17sp, caption 14sp, applied to [fontFamily]. */
internal fun seeForMeTypography(fontFamily: FontFamily): Typography {
    val base = Typography()
    return Typography(
        displayLarge = base.displayLarge.copy(fontFamily = fontFamily),
        displayMedium = base.displayMedium.copy(fontFamily = fontFamily),
        displaySmall = base.displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = base.headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = Title.copy(fontFamily = fontFamily),
        headlineSmall = base.headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = Title.copy(fontFamily = fontFamily),
        titleMedium = Label.copy(fontFamily = fontFamily),
        titleSmall = Label.copy(fontFamily = fontFamily),
        bodyLarge = Body.copy(fontFamily = fontFamily),
        bodyMedium = Body.copy(fontFamily = fontFamily),
        bodySmall = Caption.copy(fontFamily = fontFamily),
        labelLarge = Label.copy(fontFamily = fontFamily),
        labelMedium = Caption.copy(fontFamily = fontFamily, fontWeight = FontWeight.Medium),
        labelSmall = Caption.copy(fontFamily = fontFamily),
    )
}
