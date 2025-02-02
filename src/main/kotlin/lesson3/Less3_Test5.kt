package org.example.lesson3

fun main() {

    val inputData = readln()
    val firstPart = inputData.split("-")
    val from = firstPart[0]
    val secondPart = firstPart[1].split(";")
    val where = secondPart[0]
    val moveNumber = secondPart[1]
    println(from)
    println(where)
    println(moveNumber)

}
