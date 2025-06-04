package chap34

fun main() {
    val number1 = null
    val number2 = 10

    printCubicSquareRoot(number1)
    printCubicSquareRoot(number2)
}

fun printCubicSquareRoot(square: Int?) {
    if (square == null) {
        println("nullなのでなにもしない")
        return
    }
    val result = square * square
    println("<UNK>${square}を2乗した数は${result}です。")
}