package org.example.lesson14.Less14_test3

import kotlin.math.roundToInt

class Square(color: String, val height: Int, val weight: Int) : Figure(color)  {
    override fun area(): Int {
        val area = height * weight
        return area
    }

    override fun perimeter(): Int {
        val perimeter = height + weight
        return perimeter
    }
}