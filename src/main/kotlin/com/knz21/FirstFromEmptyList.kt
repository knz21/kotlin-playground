package com.knz21

object FirstFromEmptyList {

    operator fun invoke() {
        try {
            emptyList<String>().first()
        } catch (e: Exception) {
            println("Caught an exception: $e")
        }
    }
}