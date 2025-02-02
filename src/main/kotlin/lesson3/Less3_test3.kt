package org.example.lesson3

fun main() {

    val number = readln().toInt()
    for (x in 1..9) println("$number x $x = ${number * x}")

}