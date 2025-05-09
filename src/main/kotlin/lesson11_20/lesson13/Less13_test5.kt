package org.example.lesson11_20.lesson13

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
    try {
        val number: Long = readln().toLong()
    } catch (e: Exception) {
        println(e)
    }
}
