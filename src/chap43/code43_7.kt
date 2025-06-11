package chap43

fun main() {
    val car = Car2("白")
    car.drive()
    car.drive()
    println("燃料の残り: ${car.fuel}")
//    car.fuel = 70.0
    val prius = Prius2("黒")
    prius.drive()
    prius.drive()
//    prius.fuel = 70.0
    println("燃料の残り: ${car.fuel}")
}