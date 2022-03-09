fun main() {
    val temp = 19

    if(temp > 30) {
        println("very hot")
    // warto zwrócić uwagę na poniższy zapis warunków
    } else if ((temp >= 20) && (temp <= 30 )) {
        println("quite hot")
    } else if ((temp < 20) && (temp != 19)) {
        println("not hot")
    } else {
        println("exactly hot")
    }

    // można też zapisać bez nawiasów w jednej linijce
    if (temp < 30)
        println("one liner - not so hot")

    // oczywiście również w ten sposób
    // if (temp < 30) println("one liner - not so hot") else println("not hot")

    // or jest zapisywane jak w js - ||

    // structural equality - same type and content
    val n1 = 1
    val n2 = 2
    println(n1 == n2)
    println(n1 != n2)

    // referential equality - same type and content
    // porównuje, czy odnosi się do tego samego miejsca w pamięci - obiekty, będą mieć różną alokację
    // ale numbers, chars, booleans mają specjalną reprezentację i będą dawać true
    // jednak już klasy czy struktury danych, nawet jeśli zawierają to samo - nie będą się równać
    val n3 = 12
    val n4 = 12
    println(n3 === n4)
    val p1 = Person(name = "Ala")
    val p2 = Person(name = "Ala")
    println(p1 === p2)
}

class Person(val name: String)