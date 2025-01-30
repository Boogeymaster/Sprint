package org.example.lesson2

fun main() {
    val cristal = 7
    val iron = 11
    val buff = 20f
    println("Bonus of cristal is ${buffBonus(cristal, buff).toInt()}")
    println("Bonus of iron is ${buffBonus(iron, buff).toInt()}")
}
fun buffBonus(element: Int, buff: Float): Float {
    val bonus = element * (buff / 100)
    return bonus
}

