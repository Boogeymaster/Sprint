package org.example.lesson1

fun main(){
    val seconds: Short = 6480
    val minute = seconds / 60
    val partOfMinute = seconds - minute * 60
    val hour = minute / 60
    val partOfHour = minute - hour * 60
    println("${twoDigits(hour)}:${twoDigits(partOfHour)}:${twoDigits(partOfMinute)}")
}
fun twoDigits(num: Int): String {
    val twoDig = if (num < 10) {
        "0$num"
    } else {
        "$num"
    }
    return twoDig
}