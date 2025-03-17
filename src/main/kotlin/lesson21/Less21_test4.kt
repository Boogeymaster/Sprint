package org.example.lesson21

import java.io.File

fun File.writeWord(word: String) {
    val oldWords = this.readText()
    writeText(word.lowercase() + " " + oldWords)
}
