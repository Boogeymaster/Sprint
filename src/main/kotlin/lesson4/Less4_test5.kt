package org.example.lesson4

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_PROVISION = 50

fun main() {
    println("Наличие повреждений корпуса?")
    val isDamage = readln().toBoolean()
    println("Текущий состав экипажа:")
    val crew = readln().toInt()
    println("Количество ящиков с провизией на борту:")
    val provision = readln().toInt()
    println("Благоприятность метеоусловий?")
    val isWeather = readln().toBoolean()
    println("Может ли научно-исследовательский корабль приступить к долгосрочному плаванию?\nОтвет: " +
            "${(!isDamage && crew >= MIN_CREW_COUNT && crew <= MAX_CREW_COUNT && provision > MIN_PROVISION) 
                    || (isDamage && crew == MAX_CREW_COUNT && isWeather && provision >= MIN_PROVISION)}")

}

