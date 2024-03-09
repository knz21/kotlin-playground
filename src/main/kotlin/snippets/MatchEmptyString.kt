package com.knz21.snippets

object MatchEmptyString {

    operator fun invoke() {
        println("Empty string is matched: ${"string".contains("")}")
    }
}