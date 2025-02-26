package org.example.lesson16

class User() {
    val login = "login"
    private val pass = "12456"
    var isVerified = false

    fun verification() {
        if (pass == readln()) isVerified = true
    }
}

fun main() {
    val user = User()
    user.verification()
    if (user.isVerified) println("Verified")
    else println("Don't verified")
}

