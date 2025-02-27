package org.example.lesson16

class User() {
    val login = "login"
    private val pass = "12456"


    fun verification(): Boolean {
        var isVerified = false
        if (pass == readln()) isVerified = true
        return isVerified
    }
}

fun main() {
    val user = User()
    if (user.verification()) println("Verified")
    else println("Don't verified")
}

