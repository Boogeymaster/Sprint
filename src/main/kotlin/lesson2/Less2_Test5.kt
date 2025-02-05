package org.example.lesson2

import kotlin.math.floor
import kotlin.math.pow

const val ONE_PERCENT = 0.01

fun main() {
    val sum = 70_000
    val percent = 16.7
    val years = 20
    val result = sum * (1 + percent * ONE_PERCENT).pow(years)
    println("%.3f".format(result))
}

