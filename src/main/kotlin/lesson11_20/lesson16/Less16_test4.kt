package org.example.lesson11_20.lesson16

class Order() {
    private val orderNumber = 101
    private var isPrepare = false

    fun request(isPrepare: Boolean){
        if(isPrepare) changeStatus()
    }

    private fun changeStatus() {
        isPrepare = true
        println("Order is prepare")
    }

}

fun main() {

    val order = Order()
    order.request(true)

}
