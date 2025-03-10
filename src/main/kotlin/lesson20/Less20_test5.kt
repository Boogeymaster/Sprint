package org.example.lesson20


fun main() {
    val phraseList = listOf(
        "Evil olive",
        "Do geese see God?",
        "Able was I saw Elba",
        "Yo, banana boy!",
        "Madam, I’m Adam"
    )
    val inverter: (string: String) -> String = { it.reversed() }
    say(phraseList.random())
    val modifiedWords = setModifier { inverter(phraseList.random()) }
    say(modifiedWords)
}

fun say(words: String) {
    println(words)
}

fun setModifier(
    modifier: () -> String,
): String {
    val modifiedWords = modifier()
    return modifiedWords
}
