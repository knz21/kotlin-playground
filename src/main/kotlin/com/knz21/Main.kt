package com.knz21

import com.knz21.snippets.EmptyAnyAll
import com.knz21.snippets.FirstFromEmptyList
import com.knz21.snippets.HexString
import com.knz21.snippets.MatchEmptyString
import com.knz21.snippets.RandomEnum
import com.knz21.snippets.ReturnForEach
import com.knz21.snippets.TakeAndDrop

fun main() {
    listOf(
        MatchEmptyString,
        FirstFromEmptyList,
        RandomEnum,
        HexString,
        EmptyAnyAll,
        TakeAndDrop,
        ReturnForEach
    ).forEach {
        println("\n----- ${it::class.simpleName} -----")
        it()
    }
}