fun main() {
    var name: String = "Ala"
    //  name = null
    // nie da się przypisać w ten sposób - kotlin null safety language (String nie może być nullem)
    // można robić tak:

    var age: Int? = 23
    age = null
    // tu jawnie deklarujemy, że Int może być nullem = Int?


    var ala = Persona("Ala")
    var name2: Persona? = Persona("Ula")
    name2 = null

    println(ala.name)
    println(name2)

    // jeśli chcemy pracować z obiektami, które mogą być nullem, trzeba używać ?
    // znak zapytania pozwala nam sprawdzać, czy obiekt istnieje
    // w Kotlinie ?. nazywa się:  safe call
    var nameBeta: String? = "Beta"
    println(nameBeta?.length) // to daje null lub 4
    // przy zapisie z if, możemy pominąć znak zapytania, bo już sprawdzenie nulla następuje wcześniej
    if (nameBeta != null) nameBeta.length else 0 // to daje 0 lub 4

    var length = nameBeta?.substring(0, 2)?.length
    println(length)


    // elvis operator: ?:
    var elvis: String? = "Elvis"
    var length1: Int = if (elvis != null) elvis.length else 0
    // IDE zgłasza problem i każe to skrócić
    var length2: Int = elvis?.length ?: 0
    // elvis operator: jeśli cokolwiek po lewej stronie operatora jest nullem, zwróć prawą stronę
}

class Persona(val name: String)