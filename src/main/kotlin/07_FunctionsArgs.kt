fun main() {
    fWithArg("John", 23)
    fWithArg("Adam", 30)

    // argumenty możemy jawnie nazwać
    // jeśli jednak nazwiemy jeden, musimy dać nazwy do wszystkich
    // ale za to wtedy możemy podać je w dowolnej kolejności
    fWithNamedArgs(name = "Ala", age = 23, happy = false)
    // można zrobić refaktor - żeby ustawić argumenty w nowych liniach, jeśli ich jest dużo
    // ustawiasz kursor między nazwą funkcji a nawiasem i alt+Enter - okno dialogowe się pojawia
    // w ten sposób możesz dodać też nazwy argumentów, jeśli są nienazwane

    // default args
    fWithDefaultArgs("Ula")
    fWithDefaultArgs("Ela", 23)

    // many strings as argument
    fWithManyStrings("Book", "Ala", "Ela", "Ula")

    //przeciążone funkcje
    fOverloaded("Bez przeciążenia")
    fOverloaded("Z przeciążeniem", 2)
}

fun fWithArg(name: String, age: Int) {
    println("Your name is $name and you are $age ")
}

fun fWithNamedArgs(name: String, age: Int, happy: Boolean) {
    println("$name, $age, is happy: $happy")
}

fun fWithDefaultArgs(name: String, age: Int = 30, happy: Boolean = true) {
    println("$name, has default arguments: age: $age, is happy: $happy")
}

// możemy argumenty o tym samym typie przekazać w "tablicy"
// słowo kluczowe vararg
// musi być ostatnie wśród argumentów
fun fWithManyStrings(title: String, vararg authors: String) {
    println("$title and authors: ")
    // tu na razie nie wnikamy w lambdę
    authors.forEach { println("autor - $it") }
}


// w Kotlinie możemy przeciążyć funkcję (overload)
// możemy wywołać funkcję z inną liczbą parametrów, ale z tą samą nazwą
fun fOverloaded(name: String) {
    println(name)
}
fun fOverloaded(name: String, age: Int) {
    println("$name, $age")
}