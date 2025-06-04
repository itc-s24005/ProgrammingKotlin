package chap36

fun main() {
    val p = Person2()
    p.setNameAndAge("タケシ", 5)
    p.greet()
}

class Person2 {
    var name = ""
    var age = 0

    fun setNameAndAge(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun greet() {
        println("${name}です。 ${age}才です。")
    }
}