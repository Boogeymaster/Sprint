package org.example.lesson3

fun main() {

    val number = readln().toInt()
    var table = ""
    for (x in 1..9) table += "$number x $x = ${number * x}\n"
    println(table)
}