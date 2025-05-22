package cahp05

fun main(args: Array<String>) {
    val h: Int = 8
    val message1 = "本日働いた時間は、${h}時間"
    val message2 = "このペースで１年間働くと、${h * 30}hours の労働時間になります。"
    val message3 = "このペースで１年間働くと、${h * 365}hours の労働時間になります。"
    println(message1)
    println(message2)
    println(message3)
}