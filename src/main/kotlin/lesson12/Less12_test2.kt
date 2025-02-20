package org.example.lesson12

class Weather2(val dayTemp: Int, val nightTemp: Int, val isRain: Boolean) {

    fun printWeather() {
        println(
            """
            Данные за день: 
            Температура днем: $dayTemp
            Температура ночью: $nightTemp
            Осадки: $isRain
        """.trimIndent()
        )
    }

}

fun main() {
    val day1 = Weather2(32, 28, false)
    day1.printWeather()
}


