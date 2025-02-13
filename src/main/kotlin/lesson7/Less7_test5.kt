package org.example.lesson7

const val MIN_LENGTH_PASS = 6
const val MANDATORY_RANDOM = 4

fun main() {

    val simbolRange = arrayOf('0'..'9','a'..'z','A'..'Z')
    var pass = ""
    var userNumber: Int
    do {
        println("""
        Вас приветствует генератор паролей!
        Введите длину пароля (не менее 6!):   
    """.trimIndent()
        )
        userNumber = readln().toInt()
    } while (userNumber < MIN_LENGTH_PASS)
    for (i in 1..userNumber){
        if (i < MANDATORY_RANDOM) pass += (simbolRange[i-1]).random()
        else pass += (simbolRange[(0..2).random()]).random()
    }
    println(pass)

}

