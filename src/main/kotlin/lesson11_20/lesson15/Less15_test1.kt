package org.example.lesson11_20.lesson15

abstract class Creatures {
    abstract val creaturesName: String
}

interface Flying {
    val creaturesName: String

    fun fly() {
        println("$creaturesName летает")
    }
}

interface Swimming {
    val creaturesName: String

    fun swim() {
        println("$creaturesName плавает")
    }
}

class Fish(override val creaturesName: String) : Creatures(), Swimming

class Waterfowl(override val creaturesName: String) : Creatures(), Swimming, Flying

fun main() {
    val creature1 = Fish("Карась")
    val creature2 = Waterfowl("Чайка")
    val creature3 = Waterfowl("Утка")
    creature1.swim()
    creature2.swim()
    creature2.fly()
    creature3.swim()
    creature3.fly()
}
