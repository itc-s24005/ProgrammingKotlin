package exam01

import kotlin.random.Random

fun main() {
    val price = Random.nextInt(100, 9000)
    val x = readln().toInt()

    val z = if (price > x) { "足りません" }
    else {
        var zan = x - price
        var mai = 0
        val list = intArrayOf(10000, 5000, 1000, 500, 100, 50, 10, 5, 1)
        list.forEach {
            if (zan >= it) {
                mai += zan / it
                zan -= it * (zan / it)

            }
        }
        mai
    }
    println(z)
}