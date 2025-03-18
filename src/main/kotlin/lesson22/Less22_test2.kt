package org.example.lesson22

class RegularBook1(val title: String, val author: String)

data class DataBook1(val title: String, val author: String)

fun main() {

    val book1 = RegularBook1("Tuman", "Ovechkin")
    val book3 = DataBook1("Dictionary", "Ozhegov")
    println(book1) // Вывод в консоль названия класса и хэш-кода объекта
    println(book3) // Вывод в консоль удобочитаемого текстового значения свойств объекта

}
