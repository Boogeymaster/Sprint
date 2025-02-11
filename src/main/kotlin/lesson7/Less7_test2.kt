package org.example.lesson7

fun main() {

    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код:")
        if (readln().toInt() == code) {
            println("Добро пожаловать!")
            return
        }
    }

}
