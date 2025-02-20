package org.example.lesson12


class Weather {
    var dayTemp = 25
    var nightTemp = 25
    var isRain = true
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
    val day1 = Weather()
    day1.dayTemp = 28
    day1.nightTemp = 24
    day1.isRain = true
    day1.printWeather()
    val day2 = Weather()
    day2.dayTemp = 31
    day2.nightTemp = 28
    day2.isRain = false
    day2.printWeather()
}


