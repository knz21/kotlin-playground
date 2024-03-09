package com.knz21

object MatchEmptyString {

    operator fun invoke() {
        println("Empty string is matched: ${"string".contains("")}")
    }
}