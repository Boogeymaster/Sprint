package org.example.lesson9


fun main() {

    println("Введите пять ингредиентов:")
    val listOfIngredients = readln().split(", ")
    val sortedList = listOfIngredients.sorted()
    println(sortedList)

}
