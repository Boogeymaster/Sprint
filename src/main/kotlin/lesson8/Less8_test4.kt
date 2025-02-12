package org.example.lesson8

fun main() {

    val ingredients = arrayOf("курица", "лук", "грибы", "сливки")
    ingredients.forEach {
        println(it)
    }
    println("Какой ингредиент желаете заменить?")
    val selectIngredient = readln()
    if (ingredients.indexOf(selectIngredient) > 0) {
        println("Каким хотите заменить?")
        ingredients[ingredients.indexOf(selectIngredient)] = readln()
        println("Готово! Вы сохранили следующий список:")
        ingredients.forEach {
            println(it)
        }
    } else println("ингредиент не найден в списке")

}
