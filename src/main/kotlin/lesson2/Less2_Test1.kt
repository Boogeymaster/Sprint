package org.example.lesson2

fun main() {
    var sum = 0f
    val studentsPoint = listOf(3f, 4f, 3f, 5f)
    studentsPoint.forEach {
        sum += it
    }
    val averagePoint: Float = sum / studentsPoint.size
    println(averagePoint)

}
