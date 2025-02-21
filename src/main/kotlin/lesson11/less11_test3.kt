package org.example.lesson11

class Room(
    val layer: String,
    val name: String,
    val memberList: MutableList<Member>,
)

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
//    roomPrinter(roommiesAndHomies)
    addMember(room1)
    memberStatusChange(room1)
//    roomPrinter(roommiesAndHomies)
}

fun addMember(room: Room) {
    println("Write name of new member:")
    room.memberList.add(Member(name = readln()))
    println("Member successfully added")
}

fun memberStatusChange(room: Room) {
    println("Input name to change status:")
    val name = readln()
    room.memberList.forEach {
        if (it.name.equals(name, true)) {
            println("Input status:")
            it.status = readln()
        }
    }
    println("Status is changed")
}

//fun roomPrinter(room: Room) {
//    var members = ""
//    room.memberList.forEach {
//        members += "${it.avatar}   ${it.name}    ${it.status}\n"
//    }
//    println(
//        """
//        ${room.layer}
//        ${room.name}
//
//        Members:
//
//        $members
//
//
//    """.trimIndent()
//    )
//}
