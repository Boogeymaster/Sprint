package org.example.lesson11

class Room(
    val layer: String,
    val name: String,
    val memberList: MutableList<Member>,
){
    fun addMember() {
        println("Write name of new member:")
        memberList.add(Member(name = readln()))
        println("Member successfully added")
    }

    fun changeMemberStatus() {
        println("Input name to change status:")
        val name = readln()
        memberList.forEach {
            if (it.name.equals(name, true)) {
                println("Input status:")
                it.status = readln()
            }
        }
        println("Status is changed")
    }

}

class Member(
    val avatar: String = ":)",
    var name: String,
    var status: String = "разговаривает",
)

fun main() {
    val user1 = Member(
        ";)",
        "Sasha",
        "разговаривает",
    )
    val user2 = Member(
        ";D",
        "kesha",
        "микрофон выключен",
    )
    val user3 = Member(
        ":x",
        "Masha",
        "пользователь заглушен",
    )
    val room1 = Room(
        """
        |-------|
        | [:0:] |
        |-------|
""",
        "Talkonauts",
        memberList = mutableListOf(user1, user2, user3),
    )
    room1.addMember()
    room1.changeMemberStatus()
}


