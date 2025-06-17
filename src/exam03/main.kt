package exam03

fun main() {
    val Yuusya = Human()
    val zonbi = Enemy(8, 5)
    Yuusya.attackTo(zonbi)
    Yuusya.attacked(zonbi)
}