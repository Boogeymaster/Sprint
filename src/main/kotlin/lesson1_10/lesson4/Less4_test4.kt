package org.example.lesson1_10.lesson4

fun main() {

    val day = 5
    val isEven = day % 2 == 0
    println(
        """
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    $isEven
        Упражнения для спины:  $isEven
        Упражнения для пресса: ${!isEven}
    """.trimIndent()
    )

}
