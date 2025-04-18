package org.example.lesson11_20.lesson12

import kotlin.random.Random

const val KALVIN_COEFFICIENT = 273
const val DAY_IN_MONTH = 30

class Weather4(_dayTemp: Int, _nightTemp: Int, private val isRain: Boolean) {
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

    fun getDayTemp(): Int {
        return dayTemp
    }

    fun getNightTemp(): Int {
        return nightTemp
    }

    fun getIsRain(): Boolean {
        return isRain
    }
}

fun main() {
    val dayTempRange = 288..308
    val nightTempRange = 283..303
    val random = Random
    val month: MutableList<Weather4> = mutableListOf()
    for (d in 1..DAY_IN_MONTH) {
        month.add(Weather4(dayTempRange.random(), nightTempRange.random(), random.nextBoolean()))
    }
    val dayTempList = month.map { it.getDayTemp() }
    val nightTempList = month.map { it.getNightTemp() }
    val isRainList = month.map { it.getIsRain() }
    val averageDayTemp = dayTempList.average()
    val averageNightTemp = nightTempList.average()
    var isRainSum = 0
    for (i in isRainList) {
        if (i) isRainSum++
    }
    println(
        """
        Средняя дневная температура за месяц: ${"%.2f".format(averageDayTemp)} 
        Средняя ночная температура за месяц: ${"%.2f".format(averageNightTemp)}    
        Количсетво дождливых дней: $isRainSum
    """.trimIndent()
    )
}
