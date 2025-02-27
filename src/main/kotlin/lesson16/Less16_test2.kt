package org.example.lesson16

const val PERIMETER_COEFF = 2

class Round(_radius: Int) {
    private val pi = 3.14
    private val radius = _radius
    fun perimeter(): Double {
        val perimeter = PERIMETER_COEFF * pi * radius
        return perimeter
    }

    fun area(): Double {
        val area = pi * radius * radius
        return area
    }

    fun printData() {
        println("Длина окружности: ${"%.2f".format(perimeter())}")
        println("Площадь круга: ${area()}")
    }

}

fun main() {
    val round = Round(5)
    round.printData()
}
