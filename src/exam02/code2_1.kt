package exam02

import kotlin.random.Random

fun main() {
    val s1 = Dice("サイコロA")
    s1.roll()
}

class Dice constructor (var name: String, var number: Int = 1, var maxNumber: Int = 6) {
    fun roll () {
        println("${name}を振りました")
        number = Random.nextInt(1,maxNumber + 1)
        println("${number}が出ました")
    }
}