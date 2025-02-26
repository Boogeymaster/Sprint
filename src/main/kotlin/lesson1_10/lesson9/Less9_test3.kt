package org.example.lesson1_10.lesson9


fun main() {

    val quantity = listOf(2, 50, 15)
    println("Сколько порций омлета желаете?")
    val multiplier = readln().toInt()
    val answer = quantity.map { it * multiplier }
    println(
        "На $multiplier порций вам понадобится: Яиц – ${answer[0]}, " +
                "молока – ${answer[1]}, сливочного масла – ${answer[2]}"
    )

}