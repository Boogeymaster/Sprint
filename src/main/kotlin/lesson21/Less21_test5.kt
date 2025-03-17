package org.example.lesson21

import kotlin.math.max

fun Map<String, Int>.maxCategory(): String {
    val maxValue = this.maxOf { it.value }
    val categoryNames = this.filterValues { it == maxValue}.keys
    return categoryNames.first()
}

