package com.knz21.snippets

object TakeAndDrop: Snippet {

    override operator fun invoke() {
        val list = listOf(1, 2, 3, 4, 5)
        println("list: $list")
        println("take(3): ${list.take(3)}")
        println("drop(3): ${list.drop(3)}")
        println("take(10): ${list.take(10)}")
        println("drop(10): ${list.drop(10)}")
    }
}