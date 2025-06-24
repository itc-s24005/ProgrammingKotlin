package exam03

import kotlin.random.Random

abstract class Character {
    abstract var maxHp: Int
    abstract var hp: Int
    var maxMp: Int = 100
    var mp: Int = 100
    abstract val attack: Int
    abstract val defense: Int

    fun attackTo(target: Enemy): Int {
        var x: Int = ((attack * 0.5 - target.defense * 0.25) * (Random.nextInt(28, 36) / 32)).toInt()
        x = if (x < 0) 0 else x
        println("${x}ダメージ与えた！")
        target.hp -= x
        return x
    }

    fun attacked(power: Enemy): Int {
        var x: Int = ((power.attack * 0.5 - defense * 0.25) * (Random.nextInt(28, 36) / 32)).toInt()
        x = if (x < 0) 0 else x
        println("${x}ダメージ受けた！")
        hp -= x
        return x
    }
}