package org.example.lesson15

abstract class WeatherStationStats() {
    abstract val weatherData: Int
}

class Temperature(override val weatherData: Int) : WeatherStationStats()

class PrecipitationAmount(override val weatherData: Int) : WeatherStationStats()

class WeatherServer(weatherStats: WeatherStationStats) {
    init {
        if (weatherStats is Temperature) println("${weatherStats.weatherData} градусов")
        if (weatherStats is PrecipitationAmount) println("${weatherStats.weatherData} мм")
    }
}

fun main() {
    val weatherServer1 = WeatherServer(Temperature(35))
    val weatherServer2 = WeatherServer(PrecipitationAmount(100))
}

