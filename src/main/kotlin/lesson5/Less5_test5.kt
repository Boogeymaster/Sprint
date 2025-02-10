package org.example.lesson5

fun main() {
    val luckyNumbers = listOf((0..42).random(), (0..42).random(), (0..42).random())
    println("Введите цифры по очереди через Enter.")
    val userNumbers = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val intersectedNumbers = userNumbers.intersect(luckyNumbers)
    val result = when (intersectedNumbers.size) {
        1 -> """
            Пользователю выплачивается утешительный приз!
            Отгадано одно число: $intersectedNumbers 
        """.trimIndent()
        2 -> """
            пользователь получает крупный приз!
            Отгадано два числа: $intersectedNumbers
        """.trimIndent()
        3 -> """
            пользователь выиграл джекпот
            Отгаданы все числа: $intersectedNumbers
        """.trimIndent()
        else -> "пользователь не угадал, ни одного числа"
    }
    println(result)

}
