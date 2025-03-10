package org.example.lesson19

enum class Bullet {
    BLUE {
        override fun getDamage(): Int {
            return 5
        }
    },
    GREEN {
        override fun getDamage(): Int {
            return 10
        }
    },
    RED {
        override fun getDamage(): Int {
            return 20
        }
    };

    abstract fun getDamage(): Int
}

class Tank(private var tankCartridge: Bullet? = null) {

    fun reload(bullet: Bullet) {
        tankCartridge = bullet
        println("Tank reloaded")
    }

    fun shoot() {
        if (tankCartridge != null) {
            println("Tank applied ${tankCartridge?.getDamage()} damage")
        } else println("Tank cartridge is empty")
        tankCartridge = null
    }
}

fun main() {

    val tank = Tank()
    tank.reload(Bullet.BLUE)
    tank.shoot()
    tank.reload(Bullet.RED)
    tank.shoot()
    tank.shoot()
    tank.reload(Bullet.GREEN)
    tank.shoot()
}

