package chap19

fun main () {
    val map: Map<String, String> = mapOf("pen" to "ペン", "Apple" to "アップル", "Pineapple" to "パイナップル")
    val value1 = map["pen"]
    val value2 = map["Pineapple"]
    val value3 = map["Apple"]
    val value4 = map["pen"]
    println("$value1, $value2, $value3, $value4")
}