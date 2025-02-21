package org.example.lesson14.Less14_test2

class IceBreaker1(
    name: String,
    speed: Int,
    passengers: Int,
    val cargoVolume: Int,
    val isIceBreak: Boolean,
) : Liner1(
    name,
    speed,
    passengers,
) {
    override fun loading() {
        println("ворота со стороны кормы")
    }

    override fun printData() {
        super.printData()
        println("Объем трюма: $cargoVolume м³\nВозможность пролома льдов: $isIceBreak")
    }
}