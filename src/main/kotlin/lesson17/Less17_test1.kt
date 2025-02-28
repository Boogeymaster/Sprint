package org.example.lesson17

class Victorina(
    question: String,
    answer: String,
) {
    val question = "who?"
        get() = field
    var answer = "you!"
        get() = field
        set(value) {
            field = value
        }
}

