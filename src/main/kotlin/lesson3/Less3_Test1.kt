package org.example.lesson3

fun main() {

    val name = "Ivan"
    val dayTime = listOf("Good day", "Good evening")
    dayTime.forEach {
        println("$it, $name!")
    }

}