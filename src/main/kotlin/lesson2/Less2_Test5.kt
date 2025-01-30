package org.example.lesson2

import kotlin.math.floor
import kotlin.math.pow

fun main() {
    val sum = 70_000
    val percent = 16.7
    val years = 20
    val result = sum * (1 + percent * 0.01).pow(years)
    println(floor(result * 1000)/1000)
}

