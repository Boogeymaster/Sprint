package org.example.lesson14.Less14_test2

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