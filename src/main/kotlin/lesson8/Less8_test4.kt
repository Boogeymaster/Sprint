package org.example.lesson8

fun main() {

    val ingredients = arrayOf("курица", "лук", "грибы", "сливки")
    ingredients.forEach {
        println(it)
    }
    println("Какой ингредиент желаете заменить?")
    val selectIngredient = readln()
    val indexOfIngredient = ingredients.indexOf(selectIngredient)
    if (indexOfIngredient != -1) {
        println("Каким хотите заменить?")
        ingredients[indexOfIngredient] = readln()
        println("Готово! Вы сохранили следующий список:")
        ingredients.forEach {
            println(it)
        }
    } else println("ингредиент не найден в списке")

}
