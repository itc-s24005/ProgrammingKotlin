package chap21

fun main() {
    printTimes(2, 3)
    printTimes(5, 10, 20)
    printTimes(1, 10, 100, 1000)
    printTimes(2, 2, 2, 2, 2, 2, 2, 2)
}

fun printTimes(vararg number: Int) {
    var result = 1
    for (x in number) result *= x
    println("すべての数値を掛け算した結果:$result")
}