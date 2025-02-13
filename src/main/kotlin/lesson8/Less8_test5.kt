package org.example.lesson8

fun main() {

    println("Введите количество и сами ингредиенты по порядку:")
    val ingredients = Array(readln().toInt()) { readln() }
    println(ingredients.joinToString(", "))

}
