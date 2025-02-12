package org.example.lesson8

fun main() {

    val recipe = arrayOf("мясо", "лук", "картошка", "тесто")
    println("Введите искомый ингрeдиент:")
    val ingredient = readln()
    if (recipe.indexOf(ingredient) > 0) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
