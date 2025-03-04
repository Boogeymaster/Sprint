package org.example.lesson19

abstract class Ship {
    open fun takeOff() {}
    open fun landing() {}
    open fun shooting() {}
}

class AstroShip : Ship() {

    override fun landing() {
        // TODO add logic
    }

    override fun takeOff() {
        TODO()
    }

    override fun shooting() {
    }
}

fun main() {

    val ship = AstroShip()
    ship.landing()
    ship.takeOff()
    ship.shooting()

}

