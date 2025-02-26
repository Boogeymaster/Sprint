package org.example.lesson1_10.lesson4


const val TABLE_COUNTER = 13

fun main() {
    val today = 13
    val tomorrow = 9
    println("Доступность столиков на сегодня: ${today < TABLE_COUNTER}\nДоступность столиков на завтра: ${tomorrow < TABLE_COUNTER}")

}
