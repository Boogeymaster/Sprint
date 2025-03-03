package org.example.lesson_18

const val RANGE_START = 1

abstract class Dice(edges: Int) {
    open val numberRange = (RANGE_START..edges)
    fun getNumber() : Int{
        return numberRange.random()
    }
}

class Dice4(edges: Int) : Dice(edges) {
    override val numberRange = (RANGE_START..edges)
}

class Dice6(edges: Int) : Dice(edges) {
    override val numberRange = (RANGE_START..edges)
}

class Dice8(edges: Int) : Dice(edges) {
    override val numberRange = (RANGE_START..edges)
}

fun main() {

    val dice4 = Dice4(4)
    val dice6 = Dice6(6)
    val dice8 = Dice8(8)
    val diceList: List<Dice> = listOf(dice4, dice6, dice8)
    diceList.forEach {
        println(it.getNumber())
    }

}

