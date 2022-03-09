fun main() {
    // abstract classes

    // Cannot create an instance of an abstract class.
    // Nie da się stworzyć instancji klasy abstrakcyjnej.
    // Do czego więc ona jest?
    //  val d = Bird("kaczka")

    val duck = Duck(type = "Duck", sound = "Kwa")
    duck.giveSound()
    duck.startFly()
    duck.wingsLength()
    duck.sureFlying

    val pingi = Penguin()
    pingi.giveSound()
    pingi.startFly()

    fly(duck)
    fly(pingi)
}

abstract class Bird(val type: String, val isFlying: Boolean, var sound: String) {
    // klasa abstrakcyjna służy wyłącznie do rozszerzania
    // po tej klasie dziedziczą inne klasy

    // abstrakcyjne funkcje wewnątrz takiej klasy są
    // przygotowane do rozszerzania w klasach pochodnych
    // i taką funkcję trzeba w klasie pochodnej zaimplementować
    abstract fun startFly()

    // nieabstrakcyjne funkcje będą we wszystkich klasach pochodnych
    // miały taką samą implementację
    fun giveSound() {
        println(sound)
    }

}

// możemy stworzyć klasę abstrakcyjną dziedziczącą po klasie abstrakcyjnej
// i tu też dodać abstrakcyjną funkcję
abstract class FlyingBirds(type: String, sound: String) : Bird(type, isFlying = true, sound) {
    abstract fun wingsLength()
    val sureFlying = println("$type for sure is $isFlying")

    // możemy też wywołać funkcję abstrakcyjną wewnątrz innej abstrakcyjnej
    // teraz w klasie Duck nie musimy już implementować startFly,
    // gdyż tu ją implementujemy. A zobacz wywołanie. Obie te funkcje możesz wywołać na Duck,
    // ale one robią to samo
    override fun startFly() {
        wingsLength()
    }
}

class Duck(type: String, sound: String) : FlyingBirds(type, sound) {
    // jesteśmy zmuszeni do implementacji funkcji abstrakcyjnych
    // z użyciem słowa kluczowego override
    override fun wingsLength() {
        println("$type has long wings, and can start fly easy")
    }
}

class Penguin() : Bird(type = "Pingi", isFlying = false, sound = "hi") {
    override fun startFly() {
        println("$type doesn't fly")
    }
}

// Teraz dodamy funkcję, która na każdej instancji  ptaka będzie wywoływać
// funkcję startFly. Bazując na klasie abstrakcyjnej Bird
fun fly(bird: Bird) {
    bird.startFly()
}