package app.seeforme.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import app.seeforme.ui.answer.AnswerScreen
import app.seeforme.ui.ask.AskScreen
import app.seeforme.ui.find.FindScreen
import app.seeforme.ui.history.HistoryScreen
import app.seeforme.ui.listening.ListeningScreen
import app.seeforme.ui.settings.SettingsScreen
import app.seeforme.ui.welcome.WelcomeScreen

@Composable
fun SeeForMeNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val onBack: () -> Unit = { navController.popBackStack() }
    NavHost(
        navController = navController,
        startDestination = WelcomeRoute,
        modifier = modifier,
    ) {
        composable<WelcomeRoute> {
            WelcomeScreen(
                onGetStarted = {
                    navController.navigate(AskRoute) {
                        popUpTo(WelcomeRoute) { inclusive = true }
                    }
                },
                onOpenSettings = { navController.navigate(SettingsRoute) },
            )
        }
        composable<AskRoute> {
            AskScreen(
                onStartListening = { navController.navigate(ListeningRoute) },
                onOpenFind = { navController.navigate(FindRoute) },
                onOpenHistory = { navController.navigate(HistoryRoute) },
                onOpenSettings = { navController.navigate(SettingsRoute) },
            )
        }
        composable<ListeningRoute> {
            ListeningScreen(
                onAnswerReady = {
                    navController.navigate(AnswerRoute) {
                        popUpTo(ListeningRoute) { inclusive = true }
                    }
                },
                onBack = onBack,
            )
        }
        composable<AnswerRoute> {
            AnswerScreen(
                onNewQuestion = { navController.navigate(ListeningRoute) },
                onBack = onBack,
            )
        }
        composable<FindRoute> { FindScreen(onBack = onBack) }
        composable<HistoryRoute> {
            HistoryScreen(
                onOpenAnswer = { navController.navigate(AnswerRoute) },
                onBack = onBack,
            )
        }
        composable<SettingsRoute> { SettingsScreen(onBack = onBack) }
    }
}
