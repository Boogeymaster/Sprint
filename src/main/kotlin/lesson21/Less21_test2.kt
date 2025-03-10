package org.example.lesson21

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    this.forEach {
        if (it % 2 == 0) sum += it
    }
    return sum
}
