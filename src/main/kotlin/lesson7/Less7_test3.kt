package org.example.lesson7

const val START_RANGE = 0

fun main() {

    println("Input number")
    val endRange = readln().toInt()
    for (i in START_RANGE .. endRange step 2) println(i)

}


