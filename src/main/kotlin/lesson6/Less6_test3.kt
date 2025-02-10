package org.example.lesson6

fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    val seconds = readln().toInt()
    var timer = seconds
    while (timer > 0) {
        println("Осталось секунд: ${timer--}")
        Thread.sleep(1000)
    }
    println("Время вышло")

}
