package exam03

fun main() {
    val Yuusya = Human()
    val zombi = Enemy(50, 38, 23)
    Yuusya.attackTo(zombi)
    Yuusya.attacked(zombi)
}