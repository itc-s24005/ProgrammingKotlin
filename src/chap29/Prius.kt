package chap29

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは ${d}キロです。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}