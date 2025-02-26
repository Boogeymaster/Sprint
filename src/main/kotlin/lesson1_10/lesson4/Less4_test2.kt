package org.example.lesson1_10.lesson4

const val MIN_AVERAGE = 35
const val MAX_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {

    val average1 = arrayOf(20, 80)
    val average2 = arrayOf(50, 100)
    println("Груз с весом ${average1[0]} кг и объемом ${average1[1]} л соответствует категории 'Average': " +
            "${average1[0] > MIN_AVERAGE && average1[0] <= MAX_AVERAGE && average1[1] < MAX_VOLUME_AVERAGE}")
    println("Груз с весом ${average2[0]} кг и объемом ${average2[1]} л соответствует категории 'Average': " +
            "${average2[0] > MIN_AVERAGE && average2[0] <= MAX_AVERAGE && average2[1] < MAX_VOLUME_AVERAGE}")

}
