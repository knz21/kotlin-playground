package com.knz21.snippets

object RandomEnum : Snippet {

    private const val COUNT = 1000000

    override operator fun invoke() {
        val list = List(COUNT) { Three.entries.random() }
        println(
            "count: $COUNT\n" +
                "${Three.A}: ${list.count { it == Three.A }}\n" +
                "${Three.B}: ${list.count { it == Three.B }}\n" +
                "${Three.C}: ${list.count { it == Three.C }}"
        )
    }

    enum class Three {
        A, B, C
    }
}