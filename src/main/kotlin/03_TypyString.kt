fun main() {
    // stringi też są obiektami

    var stringHello: String  = "Hello World"
    println(stringHello.lowercase())

    // typ string musi być zawsze w podwójnym cudzysłowu
    // pojedynczy cudzysłów jest dozwolony dla typu Char - pojedynczy znak

    val singleChar: Char = 'a' // 16-bit Unicode character
    val newLine: Char = '\n'

    // można też string z jednym char, ale i tak z podwójnym cudzysłowem
    val s: String = "w"

    val threeLinesOFText: String = "Oto są\ntrzy linie\ntekstu"
    println(threeLinesOFText)

    // można też w ten sposób, a trimIndent służy do wycięcia wcięć
    val threeLines: String = """
        To
        Też są
        Trzy linie
        """.trimIndent()

    println(threeLines)


    // można też podmienić wcięcia na coś
    val threeLinesNewIndent: String = """
        To
        Też są
        Trzy linie
        """.replaceIndent("oh--")

    println(threeLinesNewIndent)

    // konkatenacja stringów na dwa sposoby
    val name = "Kuba"
    println("Hej " + name)
    println("Hej $name, a długość imienia to ${name.length} znaki")




    // boolean
    val isSomethingFalse: Boolean = false
    println(isSomethingFalse)
    println(!isSomethingFalse)
    println(isSomethingFalse.not())
}