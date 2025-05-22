package chap16

fun main() {
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400, 3000, 3800)
    for((indes, money) in a.withIndex()) {
        println("${indes+1}年目の時給は ${money}円です。")
    }
}