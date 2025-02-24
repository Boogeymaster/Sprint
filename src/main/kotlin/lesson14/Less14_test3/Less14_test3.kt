package org.example.lesson14.Less14_test3

import kotlin.math.roundToInt

const val BLACK = "black"
const val WHITE = "white"
const val PI = 3.14
const val PERIMETER_COEFFICIENT = 2

abstract class Figure(val color: String) {
    open fun area(): Int {
        return TODO("Provide the return value")
    }

    open fun perimeter(): Int {
        return TODO("Provide the return value")
    }
}

class Round(color: String, val radius: Int) : Figure(color) {
    override fun area(): Int {
        val area = PI * (radius * radius)
        return area.roundToInt()
    }

    override fun perimeter(): Int {
        val perimeter = PERIMETER_COEFFICIENT * PI * radius
        return perimeter.roundToInt()
    }
}

class Square(color: String, val height: Int, val width: Int) : Figure(color) {
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

    val roundList: List<Round> = listOf(
        Round(WHITE, 5),
        Round(WHITE, 6),
        Round(BLACK, 7),
        Round(BLACK, 4),
    )
    val squareList: List<Square> = listOf(
        Square(WHITE, 5, 10),
        Square(WHITE, 6, 10),
        Square(BLACK, 7, 10),
        Square(BLACK, 4, 10),
    )
    val sumPerimeterForBlack = getSumPerimeterForColor(roundList, BLACK) + getSumPerimeterForColor(squareList, BLACK)
    val sumAreaForWhite = getSumAreaForColor(roundList, WHITE) + getSumAreaForColor(squareList, WHITE)
    println(
        """
        - суммa периметров всех черных фигур: $sumPerimeterForBlack
        - суммa площадей всех белых фигур: $sumAreaForWhite
    """.trimIndent()
    )
}

fun getSumPerimeterForColor(figureList: List<Figure>, color: String): Int {
    var sumPerimeter = 0
    figureList.forEach {
        if (it.color.equals(color)) sumPerimeter += it.perimeter()
    }
    return sumPerimeter
}

fun getSumAreaForColor(figureList: List<Figure>, color: String): Int {
    var sumPerimeter = 0
    figureList.forEach {
        if (it.color.equals(color)) sumPerimeter += it.area()
    }
    return sumPerimeter
}
