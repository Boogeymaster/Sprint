package org.example.lesson14.Less14_test1

class IceBreaker(
    name: String,
    speed: Int,
    passengers: Int,
    cargoVolume: Int,
    isIceBreak: Boolean,
) : Liner(
    name,
    speed,
    passengers,
) {
}