package org.example.lesson5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите год рождения:")
    if (LocalDate.now().year - readln().toInt() >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    }

}
