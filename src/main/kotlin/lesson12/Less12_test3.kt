package org.example.lesson12

const val KALVIN_COEFFICIENT = 273

class Weather3(dayTemp: Int, nightTemp: Int, private val isRain: Boolean) {
    private val dayTemp = dayTemp - KALVIN_COEFFICIENT
    private val nightTemp = nightTemp - KALVIN_COEFFICIENT

    fun printWeather() {
        println(
            """
            Данные за день: 
            Температура днем: $dayTemp °С
            Температура ночью: $nightTemp °С
            Осадки: $isRain 
        """.trimIndent()
        )
    }
}

fun main() {
    val day = Weather3(290, 288, false)
    day.printWeather()
}

