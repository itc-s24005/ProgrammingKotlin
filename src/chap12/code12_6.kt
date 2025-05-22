package chap12

import kotlin.random.Random

fun main() {
    val score = Random.nextInt(50, 100)
    val borderS = 90
    val borderA = 80
    val borderB = 70
    val borderC = 60

    var judge = when (score) {
        in borderS..100 -> "S"
        in borderA..borderS -> "A"
        in borderB..borderA -> "B"
        in borderC..borderB -> "C"
        else -> "D"
    }
    println("$score の判定結果: $judge")
}