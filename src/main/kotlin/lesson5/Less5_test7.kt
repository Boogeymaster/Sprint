package org.example.lesson5

fun main() {

    println("Расстояние поездки (в километрах)")
    val distance = readln().toFloat()
    println("Расход топлива на 100 км (в литрах)")
    val consumption = readln().toFloat()
    println("Текущую цену за литр топлива")
    val fuelCost = readln().toFloat()
    val fuel = (distance * consumption) / 100
    val cruiseCost = fuel * fuelCost
    println("Итоговая стоимость поездки составит ${"%.2f".format(cruiseCost)} рублей")

}

