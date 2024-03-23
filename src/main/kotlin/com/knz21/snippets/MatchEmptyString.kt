package com.knz21.snippets

object MatchEmptyString : Snippet {

    override operator fun invoke() {
        println("Empty string is matched: ${"string".contains("")}")
        println("startsWith: ${"string".startsWith("")}")
        println("endsWith: ${"string".endsWith("")}")
        println("indexOf: ${"string".indexOf("")}")
    }
}