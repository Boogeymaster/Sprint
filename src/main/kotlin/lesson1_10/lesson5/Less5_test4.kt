package org.example.lesson1_10.lesson5

const val USER1_LOGIN = "Zaphod"
const val USER1_PASS = "PanGalactic"

fun main() {

    println("Введите имя пользователя:")
    if (readln() == USER1_LOGIN) {
        println("Введите пароль:")
        if (readln() == USER1_PASS) println("Добро пожаловать на борт!")
        else println("Пароль не подходит")

    } else {
        println(
            """
        Пользователь с таким именем отсутсвует.
        Если хотите зарегистрироваться, нажмите Enter
    """.trimIndent()
        )
        readln()
    }
}

