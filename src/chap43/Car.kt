package chap43

open class Car(val color: String) {
    protected var fuel = 50.0

//    fun getFuel() = 50.0

    fun drive() {
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました。")
        } else {
            println("ガス欠、で走れません！")
        }
    }

    protected open fun letEngineWork() {
        println("ブルルーーン！")
        fuel -= 1.0
    }
}