package exam03

class Human(override var maxHp: Int = 100): Character() {
    var strength: Int = 27
    var stamina: Int = 21
    var weapon: Int = 18
    var armor: Int = 14

    override var hp = maxHp
    override var attack = strength + weapon
    override var defense = stamina + armor
}