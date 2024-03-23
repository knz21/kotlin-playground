package com.knz21

import com.knz21.snippets.FirstFromEmptyList
import com.knz21.snippets.HexString
import com.knz21.snippets.MatchEmptyString
import com.knz21.snippets.RandomEnum

fun main() {
    listOf(
        MatchEmptyString,
        FirstFromEmptyList,
        RandomEnum,
        HexString
    ).forEach {
        println("\n----- ${it::class.simpleName} -----")
        it()
    }
}