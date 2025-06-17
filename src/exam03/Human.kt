package exam03

class Human(): Character() {
    var strength: Int = 20
    var stamina: Int = 10
    var weapon: Int = 15
    var armor: Int = 23

    override var attack = strength + weapon
    override var defense = stamina + armor
}