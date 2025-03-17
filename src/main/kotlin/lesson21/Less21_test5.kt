package org.example.lesson21

fun Map<String, Int>.maxCategory(): String {
    val maxValue = this.maxByOrNull { it.value }
    return maxValue?.key ?: ""
}
