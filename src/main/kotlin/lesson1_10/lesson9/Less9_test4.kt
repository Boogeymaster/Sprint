package org.example.lesson1_10.lesson9


fun main() {

    println("Введите пять ингредиентов:")
    val listOfIngredients = readln().split(", ")
    val sortedList = listOfIngredients.sorted()
    println(sortedList)

}
