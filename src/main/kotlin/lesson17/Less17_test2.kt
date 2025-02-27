package org.example.lesson17

class Ship {
    var name = "Serenity"
        set(value) {
            if (value != field) println("No-no-no!!!")
            else field = value
        }
    val averageSpeed = "33"
    val port = "heart"
}

fun main() {
    val ship = Ship()
    ship.name = "other"
}
