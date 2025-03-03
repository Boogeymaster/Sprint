package org.example.lesson9

import java.util.*
const val INGREDIENTS_COUNT = 5

fun main() {

    println("Введите пять названий ингредиентов: ")
    val ingredients = MutableList(INGREDIENTS_COUNT) { readln() }
    val ingredientsSet = ingredients.toSortedSet()
    val firstIngredient = ingredientsSet.first.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    ingredientsSet.remove(ingredientsSet.first())
    ingredientsSet.add(firstIngredient)
    println(ingredientsSet.joinToString(", "))

}
