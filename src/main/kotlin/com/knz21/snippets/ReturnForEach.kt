package com.knz21.snippets

object ReturnForEach : Snippet {

    override operator fun invoke() {
        behaveContinue()
        behaveBreak()
    }

    private fun behaveContinue() {
        println("start continue behavior")
        val list = listOf(1, 2, 3, 4, 5)
        list.forEach {
            if (it == 3) return@forEach
            println(it)
        }
        println("end")
    }

    private fun behaveBreak() {
        println("start break behavior")
        val list = listOf(1, 2, 3, 4, 5)
        list.run {
            forEach {
                if (it == 3) return@run
                println(it)
            }
        }
        println("end")
    }
}