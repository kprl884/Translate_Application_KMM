package com.alpstein.translateapplication_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform