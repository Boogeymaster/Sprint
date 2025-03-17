package org.example.lesson11_20.lesson15

abstract class Item {
    abstract val itemName: String
    abstract val quantity: Int
}

class Zip(override val itemName: String, override val quantity: Int) : Item()

class Instrument(
    override val itemName: String,
    override val quantity: Int,
    val zipList: List<Zip>,
) : Item(), Search

interface Search {
    fun searchZip() {
        print("Выполняется поиск")
    }
}

fun main() {
    val zip1 = Zip("Лезвие", 50)
    val zip2 = Zip("Ручка", 50)
    val instrument1 = Instrument("Нож", 10, (listOf(zip1, zip2)))
    instrument1.searchZip()
}


