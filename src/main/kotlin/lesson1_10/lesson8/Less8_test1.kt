package org.example.lesson1_10.lesson8

fun main() {

    val viewCounter = IntArray(7)
    println("Введите количество просмотров за каждый день недели:")
    for (i in viewCounter.indices){
        viewCounter[i] = readln().toInt()
    }
    println("Общее количество просмотров = ${viewCounter.sum()}")

}
