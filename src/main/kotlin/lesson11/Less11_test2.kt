package org.example.lesson11

class User2(
    val id: Int,
    val login: String,
    var pass: String,
    val mail: String,
    var bio: String? = null,
) {
    fun printer(user: User2) {
        println(
            """
        Данные пользователя: 
        id = ${user.id}
        login = ${user.login}
        password = ${user.pass}
        mail = ${user.mail}
        bio = ${user.bio ?: "пусто"} 
    """.trimIndent()
        )
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
}

fun main() {

    val rinat = User2(1, "rinat", "123456", "ri@nat.ru", null)
    rinat.printer(rinat)
    rinat.readerOfBio(rinat)
    rinat.passChanger(rinat)
    rinat.printer(rinat)

}


