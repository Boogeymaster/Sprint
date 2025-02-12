package org.example.lesson4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {

    val isSunnyToday = true
    val isAwningOpenToday = true
    val humidityToday = 20
    val seasonToday = "winter"
    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunnyToday == IS_SUNNY && isAwningOpenToday == IS_AWNING_OPEN && 
                    humidityToday == HUMIDITY && seasonToday != SEASON}")

}
