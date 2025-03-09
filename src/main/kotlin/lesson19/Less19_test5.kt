package org.example.lesson19

const val LIST_LENGTH = 5

class Man(val name: String, val gender: Gender)

enum class Gender() {
    MEN,
    WOMEN,
}

fun main() {
    println("Please input list of 5 people with name and gender\nAvailable next gender: ${Gender.entries}")
    val peopleList: Array<Man> = Array(LIST_LENGTH) { Man(readln(), Gender.valueOf(readln())) }
    peopleList.forEach {
        println("${it.name} ${it.gender.name}")
    }

}
