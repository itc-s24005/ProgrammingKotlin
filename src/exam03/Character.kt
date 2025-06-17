package exam03

import kotlin.random.Random

abstract class Character {
    var maxHp: Int = 100
    var hp: Int = 100
    var maxMp: Int = 100
    var mp: Int = 100
    abstract val attack: Int
    abstract val defense: Int

    fun attackTo(target: Enemy): Int {
        val x: Int = ((attack * 0.5 - target.defense * 0.25) * (Random.nextInt(28, 36) / 32)).toInt()
        println("${x}ダメージ与えた！")
        target.hp -= x
        return x
    }

    fun attacked(power: Enemy): Int {
        val x: Int = ((power.attack * 0.5 - defense * 0.25) * (Random.nextInt(28, 36) / 32)).toInt()
        println("${x}ダメージ受けた！")
        hp -= x
        return x
    }
}