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
}

fun main() {
    val tempRange = 15..35
    val random = Random
    val month: MutableList<Weather4> = mutableListOf()
    for (d in 1..DAY_IN_MONTH) {
        month.add(Weather4(tempRange.random(), tempRange.random(), random.nextBoolean()))
    }

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