package com.knz21.snippets

object HexString : Snippet {

    override operator fun invoke() {
        val hexString = "FFFFFF"
        val longValue = hexString.toLong(16)
        println(longValue)
    }
}