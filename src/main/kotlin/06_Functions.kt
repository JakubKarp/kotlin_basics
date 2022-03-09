fun main() {
    // wywołanie funkcji
    helloWorld()

}

// deklaracja funkcji: słowo fun
fun helloWorld() {
    println("Hello World")
    // funkcję można wywołać wielokrotnie
    hi()
    hi()
    hi()
    val x = returnedHi()
    println(x)

    miau()

    hoHo()
}

// defaultowo funkcje w Kotl inie zwracają type: Unit
// oczywiście kiedy nie zwracają niczego innego

fun hi(): Unit {
    println("Hi")
}

// aby coś zwrócić, słowo kluczowe: return
fun returnedHi(): String {
    return "Hi from return"
}

// podbnie jak w js deklaracja funkcjiw  funkcji i scope, oraz kolejność wywołania
fun miau() {
    println("Miau")

    fun hau() {
        println("Hau")

        fun moo() {
            println("Moo")
        }
        moo()
    }
    hau()
}

// funkcje można też zapisywać w jednej linii
// single line expression
fun hoHo() = println("Hohoho")
