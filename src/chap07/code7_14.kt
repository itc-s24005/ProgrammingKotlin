package chap07

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 100)
    // a が  0~59 なら D
    //      60~69 なら C
    //      70~79 なら B
    //      80~89 なら A
    //      90~   なら S
    // を a の値とともに出力してください

    if (a >= 90) {
        println("S$a")
    }else if(a >= 80) {
        println("A$a")
    }else if(a >= 70) {
        println("B$a")
    }else if(a >= 60) {
        println("C$a")
    }else {
        println("D$a")
    }

}