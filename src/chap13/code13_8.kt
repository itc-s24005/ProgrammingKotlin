package chap13

fun main() {
    val x = 5
    for (i in 9 downTo 1 step 3) {
        println("${x}かける${i}は、${x * i}です。")
    }
}