package org.example.lesson1_10.lesson6

const val MILLIS = 1000

fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    val seconds = readln().toLong()
    Thread.sleep(seconds * MILLIS)
    println("Прошло $seconds секунд")

}


