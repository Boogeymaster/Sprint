package org.example.lesson11

class User2(
    val id: Int,
    val login: String,
    var pass: String,
    val mail: String,
    var bio: String? = null,
) {
    fun printUserData(user: User2) {
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

    fun addBio(user: User2) {
        println("Ввод биографии:")
        user.bio = readln()
    }

    fun changePass(user: User2) {
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
    rinat.printUserData(rinat)
    rinat.addBio(rinat)
    rinat.changePass(rinat)
    rinat.printUserData(rinat)

}


