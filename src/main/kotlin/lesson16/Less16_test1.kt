package org.example.lesson16

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
