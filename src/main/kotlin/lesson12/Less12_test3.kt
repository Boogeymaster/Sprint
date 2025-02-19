package org.example.lesson12


class Weather3 (dayTemp: Int, nightTemp: Int, private val isRain: Boolean){
    private val dayTemp = dayTemp - 273
    private val nightTemp = nightTemp - 273
    fun printWeather(){
        println("""
            Данные за день: 
            Температура днем: $dayTemp °С
            Температура ночью: $nightTemp °С
            Осадки: $isRain 
        """.trimIndent())
    }
}

fun main() {
    val day = Weather3 (290,288, false)
    day.printWeather()
}

