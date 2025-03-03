package org.example.lesson15

abstract class Machine(val _passengerVolume: Int){
    open var cargoVolume = 0

    constructor(_passengerVolume: Int, _cargoVolume: Int) : this(_passengerVolume) {
        cargoVolume = _cargoVolume
    }
}

interface Movable {
    fun move()
}

interface Passengers {
    fun loadPass(quantity: Int) {
        println("$quantity Passengers loaded")
    }

    fun unloadPass(quantity: Int) {
        println("$quantity Passengers unloaded")
    }

}

interface Cargo {
    fun loadCargo(quantity: Int) {
        println("Cargo loaded")
    }

    fun unloadCargo(quantity: Int) {
        println("Cargo unloaded")
    }

}

class Automobile(_passengerVolume: Int) : Machine(_passengerVolume), Passengers {
    var passengerVolume = _passengerVolume
    override fun loadPass(quantity: Int) {
        if (passengerVolume - quantity >= 0) {
            passengerVolume -= quantity
            super.loadPass(quantity)
        }
    }

    override fun unloadPass(quantity: Int) {
        passengerVolume += quantity
        super.unloadPass(quantity)
    }
}

class Truck(_passengerVolume: Int, _cargoVolume: Int) : Machine(_passengerVolume, _cargoVolume), Passengers, Cargo{
    var passengerVolume = _passengerVolume
    override var cargoVolume = _cargoVolume
}

fun main() {

    val auto = Automobile(3)
    val truck = Truck(1, 2000)


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