package org.example.lesson12

const val KALVIN_COEFFICIENT1 = 273

class Weather6(dayTemp: Int, nightTemp: Int, private val isRain: Boolean) {
    private val dayTemp = dayTemp - KALVIN_COEFFICIENT1
    private val nightTemp = nightTemp - KALVIN_COEFFICIENT1

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
    val day = Weather6(290, 288, false)
    day.printWeather()
}

