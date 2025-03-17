package org.example.lesson22

import java.time.LocalDate

data class GalacticGuide(
    val title: String,
    val description: String,
    val date: LocalDate,
    val distance: Float,
)

fun main() {

    val stellarSystem = GalacticGuide(
        "Alpha Centauri",
        "neiborhood",
        LocalDate.of(2125, 6, 25),
        4.3f,
    )
    val(title, description, date, distance) = stellarSystem
    println("""
        $title
        $description
        $date
        $distance
    """.trimIndent())

}
