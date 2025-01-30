package org.example.lesson2

fun main() {
    val startHour = 9
    val startMinute = 39
    val travelMinute = 457
    val arriveMinute = convertToMinute(startHour, startMinute) + travelMinute
    println("Arrival time is ${convertToHour(arriveMinute)[0]}:${convertToHour(arriveMinute)[1]}")
}

fun convertToMinute(hour: Int, minute: Int): Int {
    val timeInMinute = hour * 60 + minute
    return timeInMinute
}
fun convertToHour(_minute: Int): Array<Int> {
    val hour = _minute / 60
    val minute = _minute - hour * 60
    return arrayOf(hour, minute)
}