package org.example.lesson20


fun main() {

    val elementList = listOf("01", "02", "03", "04", "05", "06", "07", "08")
    val mappedElements = elementList.map { "Нажат элемент $it" }
    for (i in 1..<mappedElements.size step 2) {
        println(mappedElements[i])
    }
}

