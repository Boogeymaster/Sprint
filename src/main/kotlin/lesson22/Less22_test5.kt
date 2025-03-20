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
    println("""
        ${stellarSystem.component1()}
        ${stellarSystem.component2()}
        ${stellarSystem.component3()}
        ${stellarSystem.component4()}
    """.trimIndent())

}
