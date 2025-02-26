package org.example.lesson16

const val PERIMETER_COEFF = 2

class Round(_radius: Int) {
    private val pi = 3.14
    private val radius = _radius
    fun perimeter() {
        val perimeter = PERIMETER_COEFF * pi * radius
        println("Длина окружности: ${"%.2f".format(perimeter)}")
    }

    fun area() {
        val area = pi * radius * radius
        println("Площадь круга: $area")
    }
}

fun main() {
    val round = Round(5)
    round.perimeter()
    round.area()
}
