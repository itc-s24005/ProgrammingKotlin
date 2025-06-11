package chap43

class Prius2(color: String) : Car(color) {
    override fun letEngineWork() {
        println("スイーン！")
        fuel -= 0.5
    }
}