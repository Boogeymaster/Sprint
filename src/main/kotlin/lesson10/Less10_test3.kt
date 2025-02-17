package org.example.lesson10

fun main() {

    println("input pass length:")
    val pass = passGenerator(readln().toInt())
    println(pass)

}
fun passGenerator(length: Int): String {
    var pass = ""
    val passArray = arrayOf('0'..'9', ' '..'/')
    for (i in 1 .. length) {
        pass += passArray[(0..1).random()].random()
    }
    return pass
}
