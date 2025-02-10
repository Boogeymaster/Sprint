package org.example.lesson7


fun main() {
    val numbersRange = 0..9
    val lettersRange = 'a'..'z'
    var pass = ""
    for (x in 1..3){
        pass += numbersRange.random().toString()
        pass += lettersRange.random().toString()
    }
    println(pass)
}


