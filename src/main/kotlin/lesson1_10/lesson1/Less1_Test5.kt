package org.example.lesson1_10.lesson1
const val PERIOD = 60
fun main(){
    val secondsOfJourney: Short = 6480
    val hours = (secondsOfJourney / PERIOD) / PERIOD
    val secondsTails = secondsOfJourney % PERIOD
    val minuteTails = (secondsOfJourney / PERIOD) % PERIOD
    println("%02d:%02d:%02d".format(hours, minuteTails, secondsTails))
}
