package org.example.lesson11_20.lesson11

class Forum(
    val members: MutableList<MemberOfForum> = mutableListOf(),
    val messages: MutableList<MessageOfForum> = mutableListOf(),
) {
    fun createNewUser(name: String) {
        members.add(MemberOfForum(members.size, name))
    }

    fun createNewMessage(id: Int){
        var isMember = false
        members.forEach {
            if (id == it.userId) isMember = true
        }
        if (isMember) messages.add(MessageOfForum(id, "Это автоматическое сообщение."))
    }

    fun printThread(forum: Forum) {
        forum.messages.forEach { println("${forum.members[it.authorId].userName}: ${it.message}") }
    }
}

class MemberOfForum(
    var userId: Int,
    var userName: String,
)

class MessageOfForum(
    val authorId: Int,
    val message: String,
)


fun main() {
    val forum = Forum()
    forum.createNewUser("Строитель №1")
    forum.createNewUser("Строитель №2")
    forum.createNewMessage(forum.members[0].userId)
    forum.createNewMessage(forum.members[0].userId)
    forum.createNewMessage(forum.members[1].userId)
    forum.createNewMessage(forum.members[1].userId)
    forum.printThread(forum)
}






