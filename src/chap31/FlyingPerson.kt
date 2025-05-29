package chap31

class FlyingPerson(name: String, age: Int) : Person(name, age), Flyable {
    fun fly() {
        println("まさか！人間が空を飛んでいます。")
    }
}