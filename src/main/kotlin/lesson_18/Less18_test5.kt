package org.example.lesson_18

abstract class Screen {
    open fun draw(x: Int, y: Int) = ""
    open fun draw(x: Float, y: Float) = ""
}

class Dot : Screen() {

    override fun draw(x: Int, y: Int): String {
        return "Создана точка с координатами $x и $y"
    }

    override fun draw(x: Float, y: Float): String {
        return "Создана точка с координатами $x и $y"
    }

}

class Square : Screen() {

    override fun draw(x: Int, y: Int): String {
        return "Создана квадрат с начальными координатами $x и $y"
    }

    override fun draw(x: Float, y: Float): String {
        return "Создана квадрат с начальными координатами $x и $y"
    }

}

class Circle : Screen() {

    override fun draw(x: Int, y: Int): String {
        return "Создана круг с координатами центра $x и $y"
    }

    override fun draw(x: Float, y: Float): String {
        return "Создана круг с координатами центра $x и $y"
    }

}


fun main() {

    val screen1 = Dot()
    val screen2 = Square()
    val screen3 = Circle()
    val screenList: List<Screen> = listOf(screen1, screen2, screen3)
    screenList.forEach {
        println("${it.draw(0, 1)}\n${it.draw(5.0f, 5.0f)}")
    }

}
