package chap11

import kotlin.random.Random

fun main(args: Array<String>) {
    val score = Random.nextInt(0, 100)
    val borderS = 90
    val borderA = 80
    val borderB = 70
    val borderC = 60

    var judge = if(score in borderS..100){
        "S"
    } else if(score in borderA..borderS) {
        "A"
    } else if(score in borderB..borderA){
        "B"
    } else if(score in borderC..borderB){
        "C"
    }else {
        "D"
    }
    println("$score の判定結果: $judge")
}