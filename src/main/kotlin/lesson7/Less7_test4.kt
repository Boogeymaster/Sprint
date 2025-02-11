package org.example.lesson7


fun main() {

    println("Введите количество секунд, которые нужно засечь:")
    for (i in readln().toInt() downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")

}
