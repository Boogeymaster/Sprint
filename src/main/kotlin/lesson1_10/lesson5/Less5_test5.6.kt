package org.example.lesson1_10.lesson5

import kotlin.math.pow

const val DEFICIENSE_BODY_MASS = 18.5
const val NORMAL_BODY_MASS = 25
const val EXCESS_BODY_MASS = 30
const val METRE_COEFFICIENT = 100

fun main() {

    println("Введите вес в килограммах:")
    val weight = readln().toFloat()
    println("Введите рост в сантиметрах:")
    val height = readln().toFloat() / METRE_COEFFICIENT
    val bmi = weight / height.pow(2)
    val result = when {
        bmi < DEFICIENSE_BODY_MASS -> "- ИМТ < $DEFICIENSE_BODY_MASS: Недостаточная масса тела"
        bmi < NORMAL_BODY_MASS -> "- $DEFICIENSE_BODY_MASS ≤ ИМТ < $NORMAL_BODY_MASS: Нормальная масса тела"
        bmi < EXCESS_BODY_MASS -> "- $NORMAL_BODY_MASS ≤ ИМТ < $EXCESS_BODY_MASS: Избыточная масса тела"
        else -> "- ИМТ ≥ $EXCESS_BODY_MASS: Ожирение"
    }
    println("$result\nИндекс массы тела равен: ${"%.2f".format(bmi)}")

}
