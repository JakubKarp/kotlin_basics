fun main() {
    // typy number w Kotlinie
    val myByte: Byte = 8 // 8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32 // 32-bit signed integer
    val myLong: Long = 64 // 64-bit signed integer

    // decimals
    val myFloat: Float = 32.00F // 32-bit floating point number
    val myDouble: Double = 64.00 // 64 -bit floating point number

    // każdy z tych typów rozszerza klasę Number, a ta z kolei jest obiektem.
    // Wszystko w kotlinie jest obiektem

    println(myInt.toDouble()::class)

    // duże liczby z separatorem można zapisać jak w js
    var bigLong: Long = 1_000_000_000
    println(bigLong)

    // są też wbudowane metody - do dodawania, mnożenia itd. - postaw kropkę i dostaniesz podpowiedzi
    val veryBigLong = bigLong.plus(12)
    println(veryBigLong)
}