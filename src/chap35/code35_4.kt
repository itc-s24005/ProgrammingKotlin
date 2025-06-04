package chap35

class Person2(var name: String, var myNumber: Int) {
    override fun equals(other: Any?): Boolean {
        return (other != null
                && other is Person2
                && this.name == other.name
                && this.myNumber == other.myNumber)
    }
}

fun main() {{
    val p1 = Person2("タケシ", 1234)
    val p2 = Person2("タケシ", 1234)

    println("p1のハッシュコード: ${p1.hashCode()}")
    println("p2のハッシュコード: ${p2.hashCode()}")

    if (p1 == p2) {
        println("二人は同一人物")
    } else {
        println("二人は別人")
    }
}}