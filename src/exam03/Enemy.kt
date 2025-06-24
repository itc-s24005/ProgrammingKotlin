package exam03

class Enemy(override var maxHp: Int,  override val attack: Int, override val defense: Int): Character() {
    override var hp = maxHp
}