package com.knz21.snippets

object MatchEmptyString : Snippet {

    override operator fun invoke() {
        println("Empty string is matched: ${"string".contains("")}")
    }
}