package org.example.lesson13

const val AGREE = "yes"

class Contact3(
    _name: String,
    _number: Long,
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

    val contactsBook: MutableList<Contact3> = mutableListOf()
    do {
        println("Введите данные:")
        val name = readln()
        val number = readln().toLongOrNull()
        if (number == null) {
            println("Номер пуст, контакт не создан.\nЖелаете повторить?")
            continue
        }
        var company: String? = readln()
        if (company == "") company = null
        contactsBook.add(Contact3(name, number, company))
        println("Добавить еще одну запись?")

    } while (readln().equals(AGREE, true))
    contactsBook.forEach { it.printData() }
}

//Задача 4 к Уроку 13
//
//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).
//
//- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и такая запись не должна добавляться;
//- для приведения введенного номера к числу используй toLongOrNull();
//- если пользователь не заполнил компанию, то в объект записывать null.
//
//Выведи созданные объекты в консоль методом класса.