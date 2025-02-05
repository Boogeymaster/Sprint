package org.example.lesson4

const val SUN = "sun"
const val TENT_OPEN = true
const val HUMIDITY = 20
const val SEASONE = "winter"

fun main() {

    val weatherToday = "sun"
    val tentIsOpenToday = true
    val humidityToday = 20
    val seasonToday = "winter"
    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${weatherToday == SUN && tentIsOpenToday == TENT_OPEN && 
                    humidityToday == HUMIDITY && seasonToday != SEASONE}")

}
