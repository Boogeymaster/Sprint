package org.example.lesson11_20.lesson_18

class Order {
    fun printData(
        orderNumber: Int,
        product: String,
    ) {
        println("Заказан товар: $product")
    }

    fun printData(
        orderNumber: Int,
        product: List<String>,
    ) {
        println("Заказаны следующие товары: $product")
    }
}

fun main() {

    val order1 = Order()
    val order2 = Order()
    order1.printData(0, "pen")
    order2.printData(1, listOf("pencil", "eraser"))

}

