package chap18

fun main(args: Array<String>) {
    val s: MutableSet<String> = mutableSetOf("あ", "い", "う", "え", "お")
    println(s)
    s.add("か")
    s += "き"
    s += "く"
    println("-----")
    println(s)
}