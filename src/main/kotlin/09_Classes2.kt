fun main() {
    // klasy w kotlinie - wiele konstruktorów oraz blok init

    val dogi1 = Animal01("hau", "Derek", true)
    dogi1.dogAnimal()

    // wywołanie drugiego konstruktora
    val dogi2 = Animal01("woo", "cox")
    dogi2.dogAnimal()

    // wywołanie trzeciego konstruktora
    val dogi3 = Animal01("zipoooo")
    dogi3.dogAnimal()
}

// wiele konstruktorów
// możemy wprowadzać do konstruktora klasy defaultowe wartości
// ale jeśli chcemy w zależności od przekazanych argumentów wywoływać różny kod
// możemy użyć wielu konstruktorów

// pierwszy konstruktor budujemy klasycznie
class Animal01(var hau: String, var name: String, var legs: Boolean) {

    // drugi konstruktor deklarujemy wewnątrz
    // this - wskazujemy na wartości. Wywołanie tego konstruktora nastąpi wtedy, gdy
    // wywołamy klasę wyłącznie z dwoma pierwszymi wartościami podanymi w tym konstruktorze
    constructor(hau: String, name: String) : this(hau, name, legs = false) {
        println("drugi konstruktor")
        // tu można zawrzeć kod, który ma się wykonać
        // jeśli wywołamy klasę tylko z drugim konstruktorem - czyli tylko dwoma argumentami
    }

    // trzeci konstruktor
    // teraz przy wywołaniu tego konstruktora, wywołuje się również drugi
    // najpierw drugi, potem trzeci - wywołania idą do góry (do drugiego, do pierwszego)
    constructor(hau: String) : this(hau, "Buba") {
        println("trzeci konstruktor")
    }

    // bloki init
    // zostaną wywołane zaraz po pierwszym konstruktorze
    // a nie po drugim i trzecim
    // tu można zrobić jakąś inicjalizację
    // jakiś kod, który się wykona zaraz po inicjalizacji klasy
    init {
        println("init 1")
    }
    init {
        println("init 2")
    }


    fun dogAnimal() {
        println("$hau $name $legs")
    }
}
