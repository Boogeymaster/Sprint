package org.example.lesson14.Less14_test3
const val BLACK = "black"
const val WHITE = "white"
fun main() {

    val roundList: List<Round> = listOf(
        Round("white", 5),
        Round("white", 6),
        Round("black", 7),
        Round("black", 4),)
    val  squareList: List<Square> = listOf(
        Square("white", 5, 10),
        Square("white", 6, 10),
        Square("black", 7, 10),
        Square("black", 4, 10),
    )
    val blackFigurePerimeterSum = 0
    var blackRoundPerimeterSum = 0
    roundList.forEach {
        if (it.color.equals(BLACK)) blackRoundPerimeterSum += it.perimeter()
    }


}

//Задача 3 к Уроку 14
//
//Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником.
//Каждая фигура имеет свой цвет и уникальные параметры:
//
//- для круга — радиус;
//- для прямоугольника — ширину и высоту.
//
//Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:
//
//- для вычисления площади;
//- для вычисления периметра.
//
//Добавь классы-наследники для вышеупомянутых типов фигур.
//Реализуй методы для вычисления площади и периметра в каждом из классов-наследников (формулы можно найти в интернете).
//
//Создай несколько объектов разных цветов (черные и белые) и сохрани в единый список. Выведи в консоль:
//
//- сумму периметров всех черных фигур;
//- сумму площадей всех белых фигур.