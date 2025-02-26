package org.example.lesson1_10.lesson5

fun main() {
    val firstNumber = 2
    val secondNumber = 2
    val testNumber = firstNumber + secondNumber

    println("""
        Для входа решите задачу:
        $firstNumber + $secondNumber = ?
    """.trimIndent())
    if (readln().toInt() == testNumber) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}
