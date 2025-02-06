package org.example.lesson5

const val FIRST_NUMBER = 1
const val SECOND_NUMBER = 9

fun main() {

    println("Введите первое число:")
    val firstInputNumber = readln().toInt()
    println("Введите второе число:")
    val secondInputNumber = readln().toInt()
    val result = if (firstInputNumber == FIRST_NUMBER && secondInputNumber == SECOND_NUMBER) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if (firstInputNumber == FIRST_NUMBER || secondInputNumber == SECOND_NUMBER) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }
    println(result)

}


