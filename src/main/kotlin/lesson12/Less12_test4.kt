package org.example.lesson12

const val KALVIN_COEFFICIENT2 = 273

class Weather3(_dayTemp: Int, _nightTemp: Int, private val isRain: Boolean) {
    private val dayTemp = _dayTemp - KALVIN_COEFFICIENT1
    private val nightTemp = _nightTemp - KALVIN_COEFFICIENT1

    init {
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
}