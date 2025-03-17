package org.example.lesson11_20.lesson14.Less14_test2

open class Liner1(
    val name: String,
    val speed: Int,
    val passengers: Int,
) {
    open fun loading() {
        println("горизонтальный трап со шкафута")
    }

    open fun printData() {
        println(
            """
            
            Название корабля: $name
            скорость: $speed узлов
            Количество пассажиров: $passengers
            Погрузка через:
        """.trimIndent()
        )
        loading()
    }
}

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

fun main() {
    val ship1 = Liner1("Titanic", 32, 2000)
    val ship2 = CargoShip1("Ever Green", 20, 30, 500000)
    val ship3 = IceBreaker1("Lenin", 18, 100, 50000, true)
    ship1.printData()
    ship2.printData()
    ship3.printData()
}

