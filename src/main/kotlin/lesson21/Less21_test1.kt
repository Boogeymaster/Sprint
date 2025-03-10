package org.example.lesson21

fun main() {
    val word = "hello"
    println(word.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'y')
    return this.count { it in vowels }
}
