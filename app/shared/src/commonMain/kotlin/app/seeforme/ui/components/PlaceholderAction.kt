package app.seeforme.ui.components

/** A navigation target shown as a button on a [PlaceholderScreen]. */
data class PlaceholderAction(
    val label: String,
    val onClick: () -> Unit,
)
