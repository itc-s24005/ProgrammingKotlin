package chap43

class Prius(color: String) : Car(color) {
    override fun letEngineWork() {
        println("スイーン！")
        // public なプロパティの protected なセッターを呼び出す
        fuel -= 0.5
    }
}