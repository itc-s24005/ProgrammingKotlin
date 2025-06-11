package chap43

public fun testPublic() {
    println("可視性修飾子が public です。")
}

private fun testPrivate() {
    println("可視性修飾子 private です。")
}

fun testPublic2() {
    println("public な関数から private の関数を呼び出す")
    // 同じファイル内なら private な関数も呼び出せる
    testPrivate()
}

public class TestPublic() {
/////    private val privateObject = TestPrivate()
/////    val testClass: TestPrivate = privateObject
}

abstract class TestAbstract

abstract class TestPrivate