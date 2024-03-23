package com.knz21.snippets

object EmptyAnyAll : Snippet {

    override operator fun invoke() {
        val emptyList = emptyList<String>()
        println("Any: ${emptyList.any { it == "" }}")
        println("All: ${emptyList.all { it == "" }}")
    }
}