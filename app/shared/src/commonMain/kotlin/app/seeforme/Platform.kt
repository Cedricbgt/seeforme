package app.seeforme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform