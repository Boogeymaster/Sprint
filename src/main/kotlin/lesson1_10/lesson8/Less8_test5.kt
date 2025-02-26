package org.example.lesson1_10.lesson8

fun main() {

    println("Введите количество и сами ингредиенты по порядку:")
    val ingredients = Array(readln().toInt()) { readln() }
    println(ingredients.joinToString(", "))

}
