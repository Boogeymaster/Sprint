package org.example.lesson12


class Weather (_dayTemp: Int, _nightTemp: Int, _isRain: Boolean){
    val dayTemp = _dayTemp
    val nightTemp = _nightTemp
    val isRain = _isRain
    var date = "25.06.2025"
    var dayOfWeek = "wednesday"
    fun printWeather(){
        println("""
            Данные за день: 
            Температура днем: $dayTemp
            Температура ночью: $nightTemp
            Осадки: $isRain
        """.trimIndent())
    }
}

fun main() {

    val day1 = Weather (25, 20, true)
    val day2 = Weather (23, 20, false)
    day1.printWeather()
    day2.printWeather()
    day1.date = "27.06.2025"
    day1.dayOfWeek = "friday"
    day2.date = "28.06.2025"
    day2.dayOfWeek = "saturday"

}


