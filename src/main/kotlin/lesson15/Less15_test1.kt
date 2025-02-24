package org.example.lesson15

abstract class Creatures : Movable {
    abstract val creaturesName: String
}

interface Movable {
    fun move() {}
}

class Fish(override val creaturesName: String): Creatures(){
    override fun move() {
        println("$creaturesName плавает")
    }
}

class Waterfowl(override val creaturesName: String): Creatures(){
    override fun move() {
        println("$creaturesName плавает и летает")
    }
}

fun main() {

    val creature1 = Fish("Карась")
    val creature2 = Waterfowl("Чайка")
    val creature3 = Waterfowl("Утка")
    creature1.move()
    creature2.move()
    creature3.move()

}
