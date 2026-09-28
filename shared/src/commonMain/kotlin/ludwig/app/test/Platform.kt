package ludwig.app.test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform