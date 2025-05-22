package chap07

fun main(args: Array<String>) {
    val delicious = true
    val cheap = true
    println("このレストランはおいしい: $delicious")
    println("このレストランは安い: $cheap")
    val latsEat = delicious || cheap
    println("食事をする？: $latsEat")
}