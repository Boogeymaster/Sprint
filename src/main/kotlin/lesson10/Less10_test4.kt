package org.example.lesson10

const val YES = "да"

fun main() {

    var userWinCounter = 0
    do {
        val game = arrayOf(randomNumber2(), randomNumber2())
        if (resultOfGame(game)) userWinCounter++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().equals(YES, true))
    println("Количество побед человека : $userWinCounter")
}

fun randomNumber2(): Int = (1..6).random()

fun resultOfGame(game: Array<Int>): Boolean {
    return if (game[0] > game[1]) true
    else if (game[0] == game[1]) false
    else false
}
