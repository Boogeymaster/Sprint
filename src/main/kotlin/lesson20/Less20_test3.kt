package org.example.lesson20

class Player1(
    val isHaveKey: Boolean,
)

fun main() {

    val player = Player1(false)
    val doorIs: (Player1) -> String = {
        if (it.isHaveKey) "Игрок открыл дверь" else "Дверь заперта"
    }
    println(doorIs(player))
}
