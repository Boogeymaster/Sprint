package org.example.lesson6

fun main() {
    var counter = 3
    var isHuman = false
    println("Докажите что вы не бот.")
    while (counter > 0) {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        println("Введите результат сложения чисел $firstNumber и $secondNumber")
        if (readln().toInt() == firstNumber + secondNumber) {
            isHuman = true
            break
        } else {
            counter--
            println("Неверно")
        }
    }
    if (isHuman) println("Добро пожаловать!")
    else println("Доступ запрещен")
}
