package org.example.lesson14.Less14_test2

fun main() {
    val ship1 = Liner1("Titanic", 32, 2000)
    val ship2 = CargoShip1("Ever Green", 20, 30, 500000)
    val ship3 = IceBreaker1("Lenin", 18, 100, 50000, true)
    ship1.printData()
    ship2.printData()
    ship3.printData()
}

