package org.example.lesson20

const val MAX_HEALTH = 100

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = MAX_HEALTH,
)

fun main() {
    val player = Player("BoogyWoogy123", 85);
    { it: Player -> it.currentHealth = MAX_HEALTH }(player)
}
