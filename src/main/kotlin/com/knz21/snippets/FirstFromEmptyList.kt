package com.knz21.snippets

object FirstFromEmptyList : Snippet {

    override operator fun invoke() {
        try {
            emptyList<String>().first()
        } catch (e: Exception) {
            println("Caught an exception: $e")
        }
    }
}