package org.example.lesson14.Less14_test3

import kotlin.math.roundToInt

const val PI = 3.14

class Round(color: String, val radius: Int) : Figure(color) {
    override fun area(): Int {
        val area = PI * (radius * radius)
        return area.roundToInt()
    }

    override fun perimeter(): Int {
        val perimeter = 2 * PI * radius
        return perimeter.roundToInt()
    }
}