package org.example.lesson_18

open class Animal(name: String) {
    open fun eat() = ""
}

class Fox(val name: String) : Animal(name) {
    override fun eat(): String {
        return "$name -> кушает ягоды"
    }
}

class Dog(val name: String) : Animal(name) {
    override fun eat(): String {
        return "$name -> кушает кости"
    }
}

class Cat(val name: String) : Animal(name) {
    override fun eat(): String {
        return "$name -> кушает рыбу"
    }
}

fun main() {

    val fox = Fox("Алиса")
    val dog = Dog("Жучка")
    val cat = Cat("Васька")
    val animals: List<Animal> = listOf(fox, dog, cat)
    animals.forEach {
        println(it.eat())
    }

}
