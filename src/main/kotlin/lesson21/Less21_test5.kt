package org.example.lesson21

import kotlin.math.max

fun Map<String, Int>.maxCategory(): String {
    val maxValue = this.maxByOrNull { it.value }
    return maxValue?.key ?: ""
}
