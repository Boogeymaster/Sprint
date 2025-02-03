package org.example.lesson1

fun main(){
    val secondsOfJourney: Short = 6480
    val period = 60
    val minutesOfJourney = secondsOfJourney / period
    val hoursOfJourney = minutesOfJourney / period
    println("${String.format("%02d", hoursOfJourney)}:${String.format("%02d", minutesOfJourney % 60)}:" +
            String.format("%02d", secondsOfJourney % 60)
    )
}
