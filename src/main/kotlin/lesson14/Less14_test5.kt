package org.example.lesson14

var MESSAGE_ID = 0

class Chat(
    val chatName: String,
    val messageList: MutableList<Message>,
) {
    fun addMessage() {
        println("input mess and author")
        messageList.add(Message(MESSAGE_ID++, readln(), readln()))
    }

    fun addThreadMessage() {
        println("input mess author and parentid")
        messageList.add(ChildMessage(MESSAGE_ID++, readln(), readln(), readln().toInt()))
    }

    fun printChat() {
        val messageGroup = messageList.groupBy {
            if (it is ChildMessage) it.parentMessageId
            else it.messId
        }
        messageGroup.keys.forEach {
            println()
            messageGroup[it]!!.forEach {
                print("${it.author} : ${it.messageString}\n\t")
            }
        }
    }
}

open class Message(
    val messId: Int,
    val messageString: String,
    val author: String,
)

class ChildMessage(
    messId: Int,
    messageString: String,
    author: String,
    val parentMessageId: Int,
) : Message(
    messId,
    messageString,
    author,
)

fun main() {
    val chat1 = Chat("Флуд", mutableListOf())
    chat1.addMessage()
    chat1.addMessage()
    chat1.addMessage()
    chat1.addThreadMessage()
    chat1.addThreadMessage()
    chat1.printChat()
}
