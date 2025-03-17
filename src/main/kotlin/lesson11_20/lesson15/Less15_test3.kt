package org.example.lesson11_20.lesson15

abstract class User {
    abstract val id: Int
    abstract val nickName: String

    fun read() {
        println("User $nickName read message.")
    }

    fun write() {
        println("User $nickName wrote message")
    }
}

interface AdminPrivelege {
    fun deleteMessage()
    fun deleteUser(user: User)
}

class SimpleUser(override val id: Int, override val nickName: String) : User()

class Admin(override val id: Int, override val nickName: String) : User(), AdminPrivelege {
    override fun deleteMessage() {
        println("Message deleted")
    }

    override fun deleteUser(user: User) {
        println("User ${user.nickName} deleted")
    }
}

fun main() {

    val user1 = Admin(0, "Cucumber")
    val user2 = SimpleUser(1, "Tomato")
    user2.write()
    user1.read()
    user1.deleteMessage()
    user1.deleteUser(user2)

}
