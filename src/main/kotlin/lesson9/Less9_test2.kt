package org.example.lesson9

const val POSITIVE_ANSWER = "да"
fun main() {

    val ingredients = mutableListOf("лапша", "курица", "грибы")
    println(
        """
        В рецепте есть базовые ингредиенты: $ingredients
        Желаете добавить еще?
    """.trimIndent()
    )
    if (POSITIVE_ANSWER.equals(readln(), true)) {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")

    }

}
