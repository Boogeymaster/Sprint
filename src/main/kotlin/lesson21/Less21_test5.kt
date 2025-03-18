package org.example.lesson21

fun Map<String, Int>.maxCategory(): String {
    return this.maxByOrNull { it.value }?.key ?: ""
}
