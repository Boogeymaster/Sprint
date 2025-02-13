package org.example.lesson8

fun main() {

    val recipe = arrayOf("мясо", "лук", "картошка", "тесто")
    println("Введите искомый ингрeдиент:")
    val ingredient = readln()
    for (x in recipe) {
        if (x == ingredient) {
            println("Ингредиент $x в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}


