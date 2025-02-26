package org.example.lesson1_10.lesson10

fun main() {

    println("input pass length:")
    val pass = passGenerator(readln().toInt())
    println(pass)

}
fun passGenerator(length: Int): String {
    var pass = ""
    val passArray = arrayOf(' '..'/', '0'..'9')
    for (i in 1 .. length) {
        pass += passArray[i % 2].random()
    }
    return pass
}
