package org.example.lesson1

fun main(){
    val secondsOfJourney: Short = 6480
    val minutesOfJourney = secondsOfJourney / 60
    val hoursOfJourney = minutesOfJourney / 60
    println("${String.format("%02d", hoursOfJourney)}:${String.format("%02d", minutesOfJourney % 60)}:" +
            String.format("%02d", secondsOfJourney % 60)
    )
}
