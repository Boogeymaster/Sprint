package org.example.lesson20

class Robot {
    val phraseList = listOf(
        "Evil olive",
        "Do geese see God?",
        "Able was I saw Elba",
        "Yo, banana boy!",
        "Madam, I’m Adam"
    )

    fun say(words: String) {
        println(words)
    }

    fun setModifier(
        modifier: () -> String,
    ): String {
        val modifiedWords = modifier()
        return modifiedWords
    }
}

fun main() {

    val robot = Robot()
    val inverter: (string: String) -> String = { it.reversed() }
    robot.say(robot.phraseList[2])
    robot.say(robot.setModifier { inverter(robot.phraseList[2]) })

}


