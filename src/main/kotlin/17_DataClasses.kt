fun main() {
    // data classes

    val a1 = Apple("Yo", "Red")
    val a2 = Apple("Yo", "Red")

    // daje true, a przy zwykłej klasie nie dałoby
    // tu porównuje wartości
    println(a1 == a2)
    // a a1 nie daje hashcodu, tylko zawartość klasy z parametrami
    println(a1)

    // data class może mieć też funkcje
    println(a1.nameLength())

    // components - parametry jako komponenty
    val appleName = a1.component1()
    val appleColor = a1.component2()
    println("Components: $appleName $appleColor")

    // dzięki komponentom mamy destrukturyzację
    // destrukturyzacja
    val (name, color) = a1
    println("destrykturyzacja: $name $color")

    // ale uwaga destrukturyzacja nie bierze nazw parametrów, tylko ich kolejność
    val (ww, uu) = a1
    println("destrykturyzacja dwa: $ww $uu")
    // da: You Red - czyli tak jak parametry są w kolejności

    // można też kopiować
    val a3 = a1.copy()
    println("skopiowane a1: $a3")
    // ale można w ten sposób też nadpisywać dane
    val a4 = a1.copy(name = "Dodo")
    println("skopiowane i nadpisane a1: $a4")

    // obsługa np. zamówienia - różne amounts ten sam podmiot
    val box1 = AppleBox(100, a1)
    val box2 = box1.copy(amount = 50)
    println("box z jabłkami: $box1")
    println("box z takimi samymi jabłkami, ale inna ilość: $box2")


    // kotlin ma wbudowane data classes
    // kilka z nich poniżej

    // Pair
    val pair = Pair("bar", "foo")
    println(pair.first)
    println(pair.second)
    //  Pair to można też tak
    val pair2 = "ohh" to "hej"
    println(pair2.first)
    println(pair2.second)

    // Triple
    val triple = Triple("Aaa", false, 3)
    println(triple)
}

// słowo kluczowe data oraz val/var w konstruktorze
data class Apple(val name: String, val color: String) {
    fun nameLength() = name.length
}

data class AppleBox(val amount: Int, val apple: Apple)