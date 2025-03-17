package org.example.lesson11_20.lesson17

class User(
    _login: String,
    _pass: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Успешная смена логина")
        }

    var pass = _pass
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {

    val user = User("Tom", "tom123456")
    user.login = "Jerry"
    println(user.pass)
    user.pass = "jerry123"
    println(user.pass)

}
