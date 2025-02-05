package org.example.lesson4


const val TABLE_COUNTER = 13

fun main() {
    val today = 13
    val tomorrow = 9
    println("Доступность столиков на сегодня: ${today < TABLE_COUNTER}\nДоступность столиков на завтра: ${tomorrow < TABLE_COUNTER}")

}


//На сайте ресторана есть онлайн бронирование.
//Бронирование доступно, когда есть свободные столики.
//Всего в ресторане 13 столов и их количество всегда неизменно.
//На сегодня забронированы все столики, а на завтра 9.
//
//Напиши программу, которая сообщает информацию о бронировании в момент запроса,
//путем сравнения данных о свободных столах с данными о столах в ресторане.
//
//– Создать переменные с количеством забронированных столов на сегодня и на завтра;
//– Вывести в консоль сообщение о доступности столиков в одном println();
//– Каждое сообщение с новой строки (НЕ использовать многострочный вывод (“”” “””));
//– Формат сообщений такой:
//[Доступность столиков на сегодня: true/false],
//[Доступность столиков на завтра: true/false].