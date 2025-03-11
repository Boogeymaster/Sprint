package org.example.lesson20

const val MAX_HEALTH = 100

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = MAX_HEALTH,
)

fun main() {
    val player = Player("BoogyWoogy123", 85);
    val healWithHealingPotion: (player: Player) -> Unit = {player.currentHealth = MAX_HEALTH}
    healWithHealingPotion(player)

}
