package org.example.lesson13

class Contact4(
    _name: String,
    _number: Long?,
    val company: String? = null,
) {
    val name = _name
    val number = _number
    fun printData() {
        println("-Имя: $name\n-Номер: $number\n-Компания: ${company ?: "<не указано>"}\n")

    }

    fun printCompany() {
        println(company ?: "<не указано>")
    }
}

fun main() {
    val number: Long? = readln().toLongOrNull()
    println("NumberFormatException")
}
