package org.example.lesson11_20.lesson13

class Contact1(
    _name: String,
    _number: Long,
    val company: String? = null,
) {
    val name = _name
    val number = _number
    fun printData() {
        println("-Имя: $name\n-Номер: $number\n-Компания: ${company ?: "<не указано>"}")
    }
}
