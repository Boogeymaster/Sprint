package org.example.lesson15

open class Machine(val passengersVolume: Int) : MoveMachine, TransportPassengers

class Truck(passengersVolume: Int, private val cargoVolume: Int) : Machine(passengersVolume), TransportCargo {
    override fun loadCargo(cargo: Int) {
        if (cargoVolume - cargo >= 0) {
            super.loadCargo(cargo)
        }
    }

    override fun loadPassengers(passengers: Int) {
        if (passengersVolume - passengers >= 0) {
            super.loadPassengers(passengers)
        }
    }
}

class Automobile(passengersVolume: Int) : Machine(passengersVolume) {
    override fun loadPassengers(passengers: Int) {
        if (passengersVolume - passengers >= 0) {
            super.loadPassengers(passengers)
        }
    }
}


interface MoveMachine {
    fun trip() {
        print("Starting drive")
        for (i in 0..2) {
            Thread.sleep(500)
            print(".")
        }
        println("Arrived!")
    }
}

interface TransportPassengers {
    fun loadPassengers(passengers: Int) {
        println("Loaded $passengers passenger")
    }

    fun unloadPassengers(passengers: Int) {
        println("Unload $passengers passengers")
    }
}

interface TransportCargo {
    fun loadCargo(cargo: Int) {
        println("Loaded $cargo ton cargo")
    }


    fun unloadCargo(cargo: Int) {
        println("Unload $cargo ton cargo")
    }
}

fun main() {
    val auto1 = Truck(1, 2000)
    val auto2 = Automobile(3)
    auto1.loadPassengers(1)
    auto1.loadCargo(2000)
    auto1.trip()
    auto1.unloadPassengers(1)
    auto1.unloadCargo(2000)
    auto2.loadPassengers(3)
    auto2.trip()
    auto2.unloadPassengers(3)
    auto2.loadPassengers(2)
    auto2.trip()
    auto2.unloadPassengers(2)
}
