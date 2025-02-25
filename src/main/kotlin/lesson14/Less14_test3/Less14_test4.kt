package org.example.lesson14.Less14_test3

open class AstroObject(val name: String, val isAtmosphere: Boolean, val isLandable: Boolean = true)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    val sputnikList: List<Sputnik>,
) : AstroObject(
    name,
    isAtmosphere,
) {

    fun printNames(planet: Planet) {
        val sputnikNameList: MutableList<String> = mutableListOf()
        planet.sputnikList.forEach {
            sputnikNameList.add(it.name)
        }
        println("Планета: ${planet.name} и его спутники: ${sputnikNameList.joinToString(", ")}")
    }

}

class Sputnik(
    name: String,
    isAtmosphere: Boolean,
) : AstroObject(
    name,
    isAtmosphere,
)

fun main() {

    val sputnik1 = Sputnik("Phobos", false)
    val sputnik2 = Sputnik("Deimos", false)
    val planet = Planet("Mars", true, listOf(sputnik1, sputnik2))
    planet.printNames(planet)

}
