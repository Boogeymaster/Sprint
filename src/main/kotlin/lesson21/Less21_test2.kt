package org.example.lesson21

fun List<Int>.evenNumbersSum(): Int {
    return this.isEvenFilter().sumOf { it }
}

fun List<Int>.isEvenFilter(): List<Int>{
    return this.filter { it % 2 == 0 }
}
