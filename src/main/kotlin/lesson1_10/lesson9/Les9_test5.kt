package org.example.lesson1_10.lesson9

import java.util.*

const val INGREDIENTS_COUNT = 5

fun main() {

    println("Введите пять названий ингредиентов: ")
    val ingredients = MutableList(INGREDIENTS_COUNT) { readln() }
    val ingredientsSet = ingredients.toSortedSet()
    val ingredientsString = ingredientsSet.joinToString(", ")
    println(ingredientsString.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

}
