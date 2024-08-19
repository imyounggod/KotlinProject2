package org.example.kmpfirst

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform