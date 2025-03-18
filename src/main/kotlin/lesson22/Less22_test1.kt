package org.example.lesson22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {

    val book1 = RegularBook("Tuman", "Ovechkin")
    val book2 = RegularBook("Tuman", "Ovechkin")
    val book3 = DataBook("Dictionary", "Ozhegov")
    val book4 = DataBook("Dictionary", "Ozhegov")
    println(book1 == book2) // сравнение ссылок на объекты
    println(book3 == book4) // сравнение содержимого объектов

}

