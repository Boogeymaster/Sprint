package org.example.lesson11_20.lesson16

class Cube {
    private val number = (1..6).random()

    fun outputNumber() {
        println(number)
    }
}

fun main() {
    val cube = Cube()
    cube.outputNumber()
}
