fun main() {
    // lists

    // bardzo podobnie tworzymy jak arrays
    val items = listOf(1, 2, 3)
    items.forEach() { println(it) }
    // przy czym jest to lista niemutowalna

    // mutowalna lista
    val mutItems = mutableListOf(1, 2, 3)
    mutItems.add(0, 24)
    mutItems.forEach() { println(it) }
     println("last is ${mutItems.last()}, and size is ${mutItems.size}")

    // możesz zainicjować pustą listę
    var el = emptyList<String>()

    // lista - klucz/wartość
    val user1 = UserWithConstructor("Dodo")
    val user2 = UserWithConstructor("Modo")
    val userList = listOf(user1, user2)
    userList[0].printFullName()

    // filtrowanie
    val names: List<String> = listOf("Ala", "Ela", "Ula")
    val filteredNames = names.filter { it != "Ala" }
    println("filteredNames: $filteredNames")
    val filteredSpecial = names.filter { it.lowercase().contains("u")}
    println("filteredSpecial: $filteredSpecial")
    // można też filtrować po wykluczeniach
    val filteredNot = names.filterNot { it.lowercase().contains("u")}
    println("filteredNot: $filteredNot")

    // jak przekazać funkcję w filtrowaniu i nie tylko przy użyciu: ::
    val ages = listOf(25, 17, 32)
    val adults = ages.filter(::filterAdults)
    println(adults)

    // znajdowanie
    // find(), first(), last(), lastOrNull(), indexOfLast()

    // łączenie dwóch list (jest też filterNotTo)
    val newNames = mutableListOf("Adam", "Robert", "Roch")
    names.filterTo(newNames, { it.lowercase().contains("u") } )
    println("new names list: $newNames")

    // jak zrobić flat list z dwóch list (to samo do arrays)
    val twoLists = listOf(newNames, names)
    println("two lists: $twoLists")
    println("two lists flatten: ${twoLists.flatten()}")

    // można też łączyć niemutowalne listy
    val twoListJoined = names.plus(newNames)
    println("two lists joined: $twoListJoined")

    // operator map
    val mappedNames = names.map { it.substring(1, 3).uppercase() }
    println("mapped list: $mappedNames")

    // operator flatMap
    val flattenMap = twoLists.flatMap { it }
    println("lists flatten by flatMap: $flattenMap")
}

// dzięki: :: funkcja będzie aplikowana na każdy element listy
fun filterAdults(value: Int): Boolean {
    return value >= 18
}
