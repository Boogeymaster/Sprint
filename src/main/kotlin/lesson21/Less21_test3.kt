package org.example.lesson21

const val MAX_HEALTH = 100

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = MAX_HEALTH,
)

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}


