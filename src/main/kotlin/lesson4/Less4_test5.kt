package org.example.lesson4

fun main() {
    println("Наличие повреждений корпуса?")
    val damage = readln().toBoolean()
    println("Текущий состав экипажа:")
    val crew = readln().toInt()
    println("Количество ящиков с провизией на борту:")
    val provision = readln().toInt()
    println("Благоприятность метеоусловий?")
    val weather = readln().toBoolean()
    println("Может ли научно-исследовательский корабль приступить к долгосрочному плаванию?\nОтвет: " +
            "${(!damage && crew in 55..70 && provision > 50) 
                    || (damage && crew == 70 && weather && provision >= 50)}")

}

