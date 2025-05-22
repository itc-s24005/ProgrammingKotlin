package chap07

fun main(args: Array<String>) {
    val delicious = false
    val cheap = false
    println("このレストランはおいしい: $delicious")
    println("このレストランは安い: $cheap")
    val latsEat = delicious || cheap
    println("食事をする？: $latsEat")
}