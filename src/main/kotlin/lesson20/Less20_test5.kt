package org.example.lesson20

class Robot {
    val phraseList = listOf(
        "Evil olive",
        "Do geese see God?",
        "Able was I saw Elba",
        "Yo, banana boy!",
        "Madam, I’m Adam"
    )
    var modifier: (String) -> String = { it }

    fun say(words: String) {
        println(modifier(words))
    }

    fun updateModifier(update: (String) -> String) {
        modifier = update
    }
}

fun main() {

    val robot = Robot()
    val inverter: (string: String) -> String = { it.reversed() }
    robot.say(robot.phraseList[4])
    robot.updateModifier(inverter)
    robot.say(robot.phraseList[4])

}


