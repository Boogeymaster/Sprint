package org.example.lesson15

abstract class WeatherStationStats{
    open fun sendStats(){}
}

class Temperature(): WeatherStationStats(){
    override fun sendStats() {
        println("Отправка темепературы")
    }
}
class PrecipitationAmount(): WeatherStationStats(){
    override fun sendStats() {
        println("Отправка количества осадков")
    }
}
class WeatherServer(weatherStats: WeatherStationStats){

}

fun main() {



}

//Задача 2 к Уроку 15
//
//Необходимо разработать простую систему мониторинга погодных условий,
//которая будет собирать данные о температуре и количестве осадков.
//
//Создай абстрактный класс WeatherStationStats.
//Он будет служить родителем для классов-объектов погодных данных:
//Temperature и PrecipitationAmount.
//
//Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer.
//Метод отправки сообщения должен принимать объект типа
//WeatherStationStats и, в зависимости от типа переданного объекта, выводить соответствующие данные.
//
//Создай по одному объекту для разных типов погодных данных и протестируй работу программы.