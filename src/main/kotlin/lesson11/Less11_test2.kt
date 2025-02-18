package org.example.lesson11

class User2(
    val id: Int,
    val login: String,
    var pass: String,
    val mail: String,
    var bio: String?,
) {

}

fun main() {

    val renat = User2(
        1,
        "Renat",
        "1234546",
        "re@nat.ru",
        null,
    )
    printer(renat)
    readerOfBio(renat)
    passChanger(renat)
    printer(renat)

}

fun printer(user: User2) {
    println("""
        Данные пользователя: 
        id = ${user.id}
        login = ${user.login}
        password = ${user.pass}
        mail = ${user.mail}
        bio = ${user.bio ?: "пусто"} 
    """.trimIndent())
}

fun readerOfBio(user: User2) {
    println("Ввод биографии:")
    user.bio = readln()
}

fun passChanger(user: User2) {
    println("Для смены пароля впишите текущий пароль: ")
    if (user.pass == readln()) {
        println("Впишите новый пароль:")
        user.pass = readln()
        println("Пароль успешно изменен.")
    }
}
