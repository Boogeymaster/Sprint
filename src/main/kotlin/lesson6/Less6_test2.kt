package org.example.lesson6

fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    val seconds = readln().toInt()
    var timer = seconds
    while (timer > 0) {
        timer--
        Thread.sleep(1000)
    }
    if (seconds == 1) {
        println("Прошлa $seconds секундa")
    } else if (seconds in 2..4) {
        println("Прошло $seconds секунды")
    } else {
        println("Прошло $seconds секунд")
    }

}


