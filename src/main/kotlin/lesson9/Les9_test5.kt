package org.example.lesson9

import java.util.*
const val INGREDIENTS_COUNT = 5

fun main() {

    println("Введите пять названий ингредиентов: ")
    val ingredients = MutableList(INGREDIENTS_COUNT) { readln() }
    val ingredientsSet = ingredients.distinct()
    val ingredientsSortedSet = ingredientsSet.sorted().toMutableList()
    ingredientsSortedSet[0] = ingredientsSortedSet[0].replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(ingredientsSortedSet.joinToString(", "))

}
