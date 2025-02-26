package org.example.lesson1_10.lesson10

const val MIN_LENGTH = 4

fun main() {

    println("Input Login and Pass")
    val login = readln()
    val pass = readln()
    if (compareLength(login) && compareLength(pass)) println("Welcome!")
    else println("Login or Pass is not enough long")

}

fun compareLength(item: String): Boolean {
    var isLong = false
    if (item.length >= MIN_LENGTH) isLong = true
    return isLong
}
