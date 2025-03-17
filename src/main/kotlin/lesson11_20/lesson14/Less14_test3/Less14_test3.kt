package org.example.lesson11_20.lesson14.Less14_test3

import kotlin.math.roundToInt

const val BLACK = "black"
const val WHITE = "white"
const val PI = 3.14
const val PERIMETER_COEFFICIENT = 2

abstract class Figure {
    abstract val color: String
    abstract fun area(): Int
    abstract fun perimeter(): Int
}

class Round(val radius: Int, override val color: String) : Figure() {
    override fun area(): Int {
        val area = PI * (radius * radius)
        return area.roundToInt()
    }

    override fun perimeter(): Int {
        val perimeter = PERIMETER_COEFFICIENT * PI * radius
        return perimeter.toInt()
    }
}

class Square(val height: Int, val width: Int, override val color: String) : Figure() {
    override fun area(): Int {
        val area = height * width
        return area
    }

    override fun perimeter(): Int {
        val perimeter = PERIMETER_COEFFICIENT * (height + width)
        return perimeter
    }
}

fun main() {
    val roundList = listOf(
        Round(5, BLACK),
        Round(5, BLACK),
        Round(5, WHITE),
        Round(5, WHITE),
    )
    val squareList = listOf(
        Square(5, 5, BLACK),
        Square(5, 5, BLACK),
        Square(5, 5, WHITE),
        Square(5, 5, WHITE),
    )
    var sumOfBlackPerimeter = 0
    roundList.forEach {
        if (it.color == BLACK) sumOfBlackPerimeter += it.perimeter()
    }
    squareList.forEach {
        if (it.color == BLACK) sumOfBlackPerimeter += it.perimeter()
    }
    var sumOfWhiteArea = 0
    roundList.forEach {
        if (it.color == WHITE) sumOfWhiteArea += it.area()
    }
    squareList.forEach {
        if (it.color == WHITE) sumOfWhiteArea += it.area()
    }
    println(
        """
        - суммa периметров всех черных фигур: $sumOfBlackPerimeter
        - суммa площадей всех белых фигур: $sumOfWhiteArea
    """.trimIndent()
    )
}


