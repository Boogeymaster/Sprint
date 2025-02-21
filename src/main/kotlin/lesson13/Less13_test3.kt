package org.example.lesson13

class Contact2(
    _name: String,
    _number: Long,
    val company: String? = null,
) {
    val name = _name
    val number = _number
    fun printData() {
        println("-Имя: $name\n-Номер: $number\n-Компания: ${company ?: "<не указано>"}")
    }

    fun printCompany() {
        println(company ?: "<не указано>")
    }
}

fun main() {
    val contactBook = mutableListOf(
        Contact2("Sasha", 89997776655, null),
        Contact2("Masha", 89997776655, null),
        Contact2("Dasha", 89997776655, "null"),
        Contact2("Pasha", 89997776655),
        Contact2("Enokentiy", 89997776655)
    )
    contactBook.forEach { it.printCompany() }

}
