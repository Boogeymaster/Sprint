package org.example.lesson10

const val LOGIN = "admin"
const val PASS = "123456"

fun main() {

    println("Input login and password:")
    println(shopCart(verification(readln(), readln())))

}

fun verification(log: String, pass: String): String? {
    return if (log == LOGIN && pass == PASS) {
        var token = ""
        val numberRange = '0'..'9'
        val litRange = 'A'..'Z'
        for (i in 1..32){
            val randomParameters = arrayOf(numberRange.random(),litRange.random())
            token += randomParameters[(0..1).random()]
        }
        token
    }
    else null
}

fun shopCart(token: String?): String {
    val shopCart = listOf("shirt", "jeans", "jacket")
    return if (token == null) "authorization is failed"
    else shopCart.joinToString(", ")
}


