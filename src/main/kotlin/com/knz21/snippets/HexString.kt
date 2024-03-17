package com.knz21.snippets

object HexString {

    operator fun invoke() {
        val hexString = "FFFFFF"
        val longValue = hexString.toLong(16)
        println(longValue)
    }
}