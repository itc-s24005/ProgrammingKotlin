package exam01

fun main() {
    var x = 0
    var ninzuu = 0
    val list = intArrayOf(1300, 2000, 1000)
    list.forEach {
        val y: Int = readln().toInt()
        x += y * it
        ninzuu += y
    }
    if (ninzuu >= 10) {x -= ninzuu * 200}
    println(x)
}