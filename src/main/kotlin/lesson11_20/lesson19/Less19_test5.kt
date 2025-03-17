package org.example.lesson11_20.lesson19

const val LIST_LENGTH = 5

class Man(val name: String, val gender: Gender)

enum class Gender {
    MEN,
    WOMEN,
    ERROR,
    UNDEFINDED,
}

fun main() {
    println("Please input list of 5 people with name and gender\nAvailable next gender: ${Gender.MEN} and ${Gender.WOMEN}")
    val peopleList: Array<Man> = Array(LIST_LENGTH) { Man(readln(), selectGender(readln())) }
    peopleList.forEach {
        println("Name: ${it.name}, gender: ${it.gender}")
    }

}

fun selectGender(input: String): Gender {
    return when (input) {
        "MEN" -> Gender.MEN
        "WOMEN" -> Gender.WOMEN
        "" -> Gender.ERROR
        else -> Gender.UNDEFINDED
    }
}
