package org.example.lesson_18

const val CUBE_EDGES = 6
const val RECTANGLE_EDGES = 2

abstract class Box {
    abstract fun area(): Int
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
