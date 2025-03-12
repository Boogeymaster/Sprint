package org.example.lesson15

open class Machine(val passengersVolume: Int) : MoveMachine, TransportPassengers, TransportCargo

class Truck(passengersVolume: Int, val CargoVolume: Int) : Machine(passengersVolume)

class Automobile(passengersVolume: Int) : Machine(passengersVolume)

interface MoveMachine {
    fun startMove() {}
    fun finishMove() {}
}

interface TransportPassengers {
    fun loadPassengers(passengersVolume: Int, passengers: Int): Int {
        var remains = 0
        if (passengersVolume - passengers != -1) {
            remains = passengersVolume - passengers
        }
        return remains
    }

    fun unloadPassengers(passengersVolume: Int, passengers: Int): Int {
        val remains = passengersVolume + passengers
        return remains
    }
}

interface TransportCargo {
    fun loadCargo(cargoVolume: Int, cargo: Int) {}
    fun unloadCargo(cargoVolume: Int, cargo: Int) {}
}


fun main() {


}

//Задача 5* к Уроку 15
//
//В логике мобильной игры есть грузовые и легковые автомобили с такими параметрами:
//
//- грузовые машины могут перевозить одного пассажира и 2 тонны груза;
//- легковые не перевозят груз, но могут вместить до 3 пассажиров.
//
//Создай интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.
//
//- учитывай максимальное и текущее количество перевозимых людей или грузов;
//- интерфейсы должны содержать методы загрузки и разгрузки пассажиров или грузов.
//
//Спроектируй классы и несколько объектов.
//Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.