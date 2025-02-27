package org.example.lesson17

class Package(
    _id: Int,
    _position: String,
) {
    var replacementCounter = 0
    val id = _id
    var position = _position
        set(value) {
            replacementCounter++
            field = value
        }
}

fun main() {

    val pack = Package(123, "Guangzhou")
    pack.position = "Vladivistok"
    pack.position = "Moskow"
    println(pack.replacementCounter)

}

