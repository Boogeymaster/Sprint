package org.example.lesson14.Less14_test1

open class Liner(
    val name: String,
    val speed: Int,
    val passengers: Int,
)

class IceBreaker(
    name: String,
    speed: Int,
    passengers: Int,
    cargoVolume: Int,
    isIceBreak: Boolean,
) : Liner(
    name,
    speed,
    passengers,
)

class CargoShip(
    name: String,
    speed: Int,
    passengers: Int,
    cargoVolume: Int,
) : Liner(
    name,
    speed,
    passengers,
)

fun main() {

    val ship1 = Liner("Titanic", 32, 2000)
    val ship2 = CargoShip("Ever Green", 20, 30, 500000)
    val ship3 = IceBreaker("Lenin", 18, 100, 50000, true)

}
