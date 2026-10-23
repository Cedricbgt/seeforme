package app.seeforme

import androidx.compose.ui.window.ComposeUIViewController

// Named like a type because Swift calls it as a UIViewController factory.
@Suppress("FunctionNaming", "ktlint:standard:function-naming")
fun MainViewController() = ComposeUIViewController { App() }
