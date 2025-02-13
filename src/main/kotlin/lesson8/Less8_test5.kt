package org.example.lesson8

fun main() {

    println("Введите количество ингредиентов:")
    val ingredients = Array(readln().toInt()) { "" }
    println("Введите желаемые ингредиенты:")
    ingredients.forEach {
        ingredients[ingredients.indexOf(it)] = readln()
    }
    ingredients.forEach {
        if (ingredients.indexOf(it) == ingredients.size - 1) print(it)
        else print("$it, ")
    }
}
