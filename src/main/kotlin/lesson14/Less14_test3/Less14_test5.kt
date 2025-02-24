package org.example.lesson14.Less14_test3

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

//Задача 5* к Уроку 14
//
//Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord. Класс должен иметь следующие методы:
//
//- addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
//- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения),
//дополнительно принимает на вход parentMessageId для идентификации сообщения, под которым создается ветка обсуждения;
//
//Сообщения чата должны храниться в списке, в классе Chat.
//Для создания сообщений соответствующих типов используй классы Message и ChildMessage в соответствующей иерархии.
//У каждого типа сообщения должен быть id.
//
//- printChat() — печатает все сообщения чата.
//Если создано дочернее сообщение, необходимо применить для вывода табуляцию и печатать его под родительским сообщением.
//Используй groupBy() для группировки сообщений по parentMessageId,
// если сообщение является экземпляром ChildMessage, или по id если это обычное сообщение.