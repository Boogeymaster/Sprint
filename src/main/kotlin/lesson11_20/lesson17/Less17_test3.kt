package org.example.lesson11_20.lesson17

class Folder{
    var name = "Passwords"
        get() = if (isSecret) "Hidden folder" else field
    var fileQuantity = 15
        get() = if (isSecret) 0 else field
    val isSecret = true
}

fun main() {

    val folder = Folder()
    println(folder.name)
    println(folder.fileQuantity)

}


