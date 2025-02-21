package org.example.lesson14.Less14_test2

class CargoShip1(
    name: String,
    speed: Int,
    passengers: Int,
    val cargoVolume: Int,
) : Liner1(
    name,
    speed,
    passengers,
) {
    override fun loading() {
        println("погрузочный кран")
    }

    override fun printData() {
        super.printData()
        println("Объем трюма: $cargoVolume м³")
    }
}