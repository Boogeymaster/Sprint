package org.example.lesson17

class Ship {
    var name = "Serenity"
        set(value) {
            println("No-no-no!!!")
        }
    val averageSpeed = "33"
    val port = "heart"
}

fun main() {
    val ship = Ship()
    ship.name = "other"
}
