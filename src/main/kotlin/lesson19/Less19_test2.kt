package org.example.lesson19

enum class Category {
    DRESS {
        override fun getName(): String {
            return DRESS.name
        }
    },
    STATIONERY {
        override fun getName(): String {
            return STATIONERY.name
        }
    },
    OTHERS {
        override fun getName(): String {
            return OTHERS.name
        }
    };

    abstract fun getName(): String
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun genInfo() {
        println("Название товара: $name\nКатегория: ${category.getName()}\n-----------------------")
    }
}

fun main() {

    val product1 = Product("Shirt", 1, Category.DRESS)
    val product2 = Product("Scicors", 2, Category.STATIONERY)
    val product3 = Product("Wires", 3, Category.OTHERS)
    val productList: List<Product> = listOf(product1, product2, product3)
    productList.forEach {
        it.genInfo()
    }

}
