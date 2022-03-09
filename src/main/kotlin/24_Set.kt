fun main() {
    // set
    // wygląda jak lista, natomiast nie pozwala duplikować elementów
    // każdy element jest unikalny

    val setOfInt = setOf(1, 2, 3, 1, 2, 3)
    println(setOfInt)

    val mutSetOfInt = mutableSetOf(1, 2, 3, 1, 2, 3)
    println(mutSetOfInt)
}
