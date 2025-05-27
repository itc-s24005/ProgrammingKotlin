package chap25

fun main() {
    val p = Person("タケシ", 5)
    p.greet()
    p.greet()
    val p2 = Person("ケンタ", 8)
    p2.greet()
    val p3 = Person("ユミ")
    p3.greet()
    //val p4 = Person(7)
    //p4.greet()
}

class Person constructor(var name: String, var age: Int = 0) {
    fun greet() {
        println("${name}です。 ${age}才です。")
    }
}