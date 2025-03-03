package org.example.lesson_18

open class Dice {
    open fun printNumber() = ""
}

class Dice4 : Dice() {
    private val edges = arrayOf("1", "2", "3", "4")

    override fun printNumber(): String {
        return edges[edges.indices.random()]
    }
}

class Dice6 : Dice() {
    private val edges = arrayOf("1", "2", "3", "4", "5", "6")

    override fun printNumber(): String {
        return edges[edges.indices.random()]
    }
}

class Dice8 : Dice() {
    private val edges = arrayOf("1", "2", "3", "4", "5", "6", "7", "8")

    override fun printNumber(): String {
        return edges[edges.indices.random()]
    }
}

fun main() {

    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    val diceList: List<Dice> = listOf(dice4, dice6, dice8)
    diceList.forEach {
        println(it.printNumber())
    }

}

