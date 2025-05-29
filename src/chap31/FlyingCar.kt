package chap31

class FlyingCar(color: String) : Car(color), Flyable {
    fun fly() {
        println("すごい！車が空を飛んでいます。")
    }
}