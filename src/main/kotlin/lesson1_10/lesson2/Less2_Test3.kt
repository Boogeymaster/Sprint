package org.example.lesson1_10.lesson2
const val PERIOD = 60
fun main() {
    val startHour = 9
    val startMinute = 39
    val travelMinute = 457
    val arriveMinute = convertToMinute(startHour, startMinute) + travelMinute
    println("Arrival time is ${convertToHour(arriveMinute)[0]}:${convertToHour(arriveMinute)[1]}")
}

fun convertToMinute(hour: Int, minute: Int): Int {
    val timeInMinute = hour * PERIOD + minute
    return timeInMinute
}
fun convertToHour(_minute: Int): Array<Int> {
    val hour = _minute / PERIOD
    val minute = _minute - hour * PERIOD
    return arrayOf(hour, minute)
}