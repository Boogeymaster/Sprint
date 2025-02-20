package org.example.lesson12

import kotlin.random.Random

const val KALVIN_COEFFICIENT = 273
const val DAY_IN_MONTH = 30

class Weather4(_dayTemp: Int, _nightTemp: Int, private val isRain: Boolean) {
    private val dayTemp = _dayTemp - KALVIN_COEFFICIENT
    private val nightTemp = _nightTemp - KALVIN_COEFFICIENT

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
    println("""
        Средняя дневная температура за месяц: ${"%.2f".format(averageDayTemp)} 
        Средняя ночная температура за месяц: ${"%.2f".format(averageNightTemp)}    
        Количсетво дождливых дней: $isRainSum
    """.trimIndent())
}



//Задача 5* к Уроку 12
//
//Продолжи усовершенствовать программу,
//теперь она должна рассчитывать средние
//значения температур и считать количество дней с осадками за месяц.
//
//Представь, что данные ты получаешь отдатчиков.
//Сымитируй их поведение с помощью random.
//
//- в функции main() создай список и добавь в него
//с помощью цикла 30 объектов класса, передав в конструкторы случайные значения;
//- извлеки из списка дневные и ночные температуры,
//используя функцию map, а также посчитай количество дней с осадками;
//- вычисли средние значения дневных и ночных
//температур с помощью специальной extension-функции из стандартной библиотеки;
//- посчитай количество дней с осадками.
//
//Выведи результаты в консоль.