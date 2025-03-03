package org.example.lesson_18

const val RANGE_START = 1

abstract class Dice {
    open fun printNumber() = 0
}

class Dice4(edges: Int) : Dice() {
    private val numberRange = (RANGE_START..edges)

    override fun printNumber(): Int {
        return numberRange.random()
    }
}

class Dice6(edges: Int) : Dice() {
    private val numberRange = (RANGE_START..edges)

    override fun printNumber(): Int {
        return numberRange.random()
    }
}

class Dice8(edges: Int) : Dice() {
    private val numberRange = (RANGE_START..edges)

    override fun printNumber(): Int {
        return numberRange.random()
    }
}

fun main() {

    val dice4 = Dice4(4)
    val dice6 = Dice6(6)
    val dice8 = Dice8(8)
    val diceList: List<Dice> = listOf(dice4, dice6, dice8)
    diceList.forEach {
        println(it.printNumber())
    }

}

