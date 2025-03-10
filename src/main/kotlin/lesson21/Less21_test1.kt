package org.example.lesson21

fun main() {
    val word = "hello"
    println(word.vowelCount())
}

fun String.vowelCount(): Int {
    var vowelCount = 0
    this.forEach {
        if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' || it == 'y') vowelCount++
    }
    return vowelCount
}
