package cahp05

import jdk.internal.org.jline.utils.Colors.h

fun main(args: Array<String>) {
    val world = "世界"
    val message = "こんにちは、世界！ \n" +
            "私は Kotlinに関して勉強しています。 \n" +
            "Kotlinでは、とても簡潔なプログラミングを書くことができます。 \n" +
            "皆さん、一緒に楽しくプログラミングしましょう！".trimMargin()

    val message2 = """|
        |こんにちは、世界！
        |私は Kotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラミングを書くことができます。
        |皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()

    val message3 = """
        こんにちは、${world}！
        私は Kotlinに関して勉強しています。
        Kotlinでは、とても簡潔なプログラミングを書くことができます。
        皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()

    println(message)
    println(message2)
    println(message3)
}