package org.example.lesson_18

const val CUBE_EDGES = 6
const val RECTANGLE_EDGES = 2

open class Box {
    open fun area(): Int = 0
}

class Cube(val edgeLength: Int) : Box() {

    override fun area(): Int {
        val area = CUBE_EDGES * (edgeLength * edgeLength)
        return area
    }
}

class Rectangle(
    val length: Int,
    val width: Int,
    val height: Int,
) : Box() {
    override fun area(): Int {
        val area = RECTANGLE_EDGES * length * width +
                RECTANGLE_EDGES * width * height +
                RECTANGLE_EDGES * height * length
        return area
    }
}

fun main() {

    val box1: Box = Cube(6)
    val box2: Box = Rectangle(5, 5, 5)
    val boxes: List<Box> = listOf(box2, box1)
    boxes.forEach {
        println(it.area())
    }

}
