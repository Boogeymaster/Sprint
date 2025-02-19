package org.example.lesson11

class Forum(
    val members: MutableList<MemberOfForum> = mutableListOf(),
    val messages: MutableList<MessageOfForum> = mutableListOf(),
) {
    fun createNewUser(name: String, forum: Forum): Forum {
        forum.members.add(MemberOfForum(forum.members.size, name))
        return forum
    }

    fun createNewMessage(id: Int, forum: Forum): Forum {
        var isMember = false
        forum.members.forEach {
            if (id == it.userId) isMember = true
        }
        if (isMember) forum.messages.add(MessageOfForum(id, "Это автоматическое сообщение."))
        return forum
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
    forum.createNewUser("Строитель №1", forum)
    forum.createNewUser("Строитель №2", forum)
    forum.createNewMessage(forum.members[0].userId, forum)
    forum.createNewMessage(forum.members[0].userId, forum)
    forum.createNewMessage(forum.members[1].userId, forum)
    forum.createNewMessage(forum.members[1].userId, forum)
    forum.printThread(forum)
}


//Задача 5* к Уроку 11
//
//Реализовать класс работы форума (Forum).
//Для реализации создай дополнительные классы для сущностей
//“Член форума” (с полями userId и userName)
//и “Сообщение форума” (с полями authorId и message).
//
//Примени паттерн “Строитель” для создания
//пользователей и сообщений форума. Напрямую
//объекты не создаются, логика должна быть
//инкапсулирована внутри методов класса.
//
//- createNewUser() создает новых пользователей,
//принимая имя пользователя. Метод сохраняет нового
//пользователя в общий список и одновременно возвращает новый объект.
//Генерация id-шников новых пользователей происходит внутри;
//- createNewMessage() создает сообщения, принимая
//id пользователя. Сообщения создаются только если
//такой пользователь есть на форуме;
//- printThread() печатает в консоль все сообщения
//добавленные на форум в формате:
//
//автор: сообщение
//автор: сообщение
//
//Создай экземпляр Forum и продемонстрируй
//его работу, добавив двух пользователей и по два сообщения от каждого пользователя.






