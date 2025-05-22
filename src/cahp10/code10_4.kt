package cahp10

fun main() {
    val rangeA: LongRange = 0..1000000000000000000L
    val rangeB: CharRange= 'A'..'E'
    val rangeC: CharRange = 'あ'..'お'

    val falgA = 500 in rangeA
    val falgB = 'D' in rangeB
    val falgC = 'え' in rangeC

    println("flagA: $falgA")
    println("flagB: $falgB")
    println("flagC: $falgC")
}