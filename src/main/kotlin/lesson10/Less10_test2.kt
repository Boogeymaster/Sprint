package org.example.lesson10


fun main() {

    println("Input Login and Pass")
    val login = readln()
    val pass = readln()
    if (compareLength(login) && compareLength(pass)) println("Welcome!")
    else println("Login or Pass is not enough long")

}

fun compareLength(item: String): Boolean {
    var isLong = false
    if (item.length >= 4) isLong = true
    return isLong
}
