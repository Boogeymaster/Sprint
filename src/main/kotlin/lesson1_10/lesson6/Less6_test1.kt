package org.example.lesson1_10.lesson6

fun main() {

    println(
        """
    Добро пожаловать на страницу регистрации!
    Введите логин:
""".trimIndent()
    )
    val userLogin = readln()
    println("Придумайте пароль:")
    val userPass = readln()
    do {
        println(
            """
            Добро пожаловать на страницу авторизации!
            Введите логин:
        """.trimIndent()
        )
        val isCorrectLogin = userLogin == readln()
        println("Введите пароль:")
        val isCorrectPass = userPass == readln()
    } while (!isCorrectLogin || !isCorrectPass)
    println("Авторизация прошла успешно")

}
