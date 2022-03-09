fun main() {
    // arrays

    // prosta tablica
    val items = arrayOf(1, 2, 3, 4)
    items.forEach { println(it) }
    val newItems = items.plus(5)
    newItems.forEach { println(it) }
    val atZero = newItems[0] // lub newItems.get(0)
    println("at zeto is $atZero")
    newItems.set(1, 14)
    val atOne = newItems[1]
    println("at one is $atOne")

    // tablica obiektów
    val users = arrayOf(
        UserWithConstructor("Jan"),
        UserWithConstructor("Dan"),
        UserWithConstructor("Wan")
    )
    users.forEach { it.printFullName() }

}


// mamy też tablice od razu z typami
// intArrayOf(), doubleArrayOf(), a nawet booleanArrayOf()

// zapis lambdy
// items.forEach { println(it) }
// jest równoważny
// items.forEach { val -> println(val) }
// gdy jest jeden argument odnosimy się do niego poprzez it
