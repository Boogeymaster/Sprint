package org.example.lesson16

class Player(
    val name: String,
    _health: Int,
    var hitPoint: Int,
) {
    private var health = _health
    private var isDead = false

    fun takeDamage() {
        if (!isDead) health--
        if (health == 0) death()
    }

    fun healing() {
        if (!isDead) health++
    }

    private fun death() {
        hitPoint = 0
        isDead = true
        println("You died.")
    }

}

fun main() {

    val player1 = Player("Bubba", 2, 1)
    player1.takeDamage()
    player1.healing()
    player1.takeDamage()
    player1.takeDamage()

}


