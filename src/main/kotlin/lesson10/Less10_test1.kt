package org.example.lesson10

fun main() {
    val resultOfLuck = mapOf("человечество" to randomNumber(), "машина" to randomNumber())
    printer(resultOfLuck)
    result(resultOfLuck)
}

fun randomNumber(): Int = (1..6).random()

fun printer(i: Map<String, Int>) {
    i.forEach {
        println("Бросает кость: ${it.key}, Результат: ${it.value}")
    }
}

fun result(resultOfLuck: Map<String, Int>) {
    if (resultOfLuck["человечество"]!! > resultOfLuck["машина"]!!) println("Победило человечество")
    else if (resultOfLuck["человечество"]!! == resultOfLuck["машина"]!!) println("Победила дружба")
    else println("Победила машина")
}