package org.example.lesson11

class User(
    val id: Int,
    val login: String,
    val pass: String,
    val mail: String,
)

fun main() {

    val user1 = User(1, "Tom", "mouse", "tom@metro.goldwin.mayer.com")
    val user2 = User(2, "Jerry", "cheeze", "jerry@metro.goldwin.mayer.com")
    printer(user1)
    printer(user2)

}

fun printer(user: User) {
    println("${user.id}, ${user.login}, ${user.pass}, ${user.mail}")
}
