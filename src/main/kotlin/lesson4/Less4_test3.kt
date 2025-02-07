package org.example.lesson4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY = 20
const val SEASONE = "winter"

fun main() {

    val weatherToday = true
    val tentIsOpenToday = true
    val humidityToday = 20
    val seasonToday = "winter"
    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${weatherToday == IS_SUNNY && tentIsOpenToday == IS_AWNING_OPEN && 
                    humidityToday == HUMIDITY && seasonToday != SEASONE}")

}
