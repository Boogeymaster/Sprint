package org.example.lesson11_20.lesson19

enum class Fish{
    GUPPY,
    ANGEL_FISH,
    GOLD_FISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {

    for (i in Fish.entries){
        println("Вы можете добавить ${i.name}")
    }

}
