package exam01

fun main() {
    val x: Int = readln().toInt()

    (1..x).forEach {

        val result = if (it % 15 == 0) "FizzBuzz"
        else if (it % 5 == 0) "Buzz"
        else if (it % 3 == 0) "Fizz"
        else it.toString()
        println(result)
    }
}