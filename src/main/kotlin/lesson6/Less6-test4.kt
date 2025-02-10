package org.example.lesson6

fun main() {
    var counter = 5
    val luckyNumber = (1..9).random()
    do {
        println("Угадай число от 1 до 9:")
        val userNumber = readln().toInt()
        if (userNumber == luckyNumber) {
            println("Это была великолепная игра!")
            counter = 0
        } else {
            println("Неверно, оставшееся количсетво попыток ${--counter}")
        }
    } while (counter > 0)
    println("Было загадано число $luckyNumber")
}
