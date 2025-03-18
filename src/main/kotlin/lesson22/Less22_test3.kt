package org.example.lesson22


fun main() {
    val example = Triple("plov", 300, true)
    val (title, weight, isAwesome) = example
    println(title)
    println(weight)
    println(isAwesome)
}

