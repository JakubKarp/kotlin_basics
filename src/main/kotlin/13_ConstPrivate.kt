fun main() {
    // prywatne i niezmienne - const
    // oraz lateinit

    var plant = FavoritePlant()
    println(plant.name)

    // do weight nie mamy dostępu - jest prywatne, dostępne tylko w zakresie klasy - wewnątrz
    // println(plant.weight)

    println(plant.retPu())
    // ale już do samego puPu nie mamy dostępu
    //println(FavoritePlant.puPu)

    // do count zadeklarowanego z const też nie mamy dostępu, chyba że przez companion object
    println(FavoritePlant.count)

    // możemy też skorzystać z object / singleton
    println(Constants.ROW_BASIC)

    // przypisanie wartości lateinit w miejscu wywołania
    plant.przypiszeValuePotem = "teraz przypisuję"
    println(plant.przypiszeValuePotem)
}

class FavoritePlant {
    val name: String = "rose"
    private val weight: Int = 0

    companion object {
        const val count: Int = 10
        // a to będzie dostępne tylko w scope klasy, ale już poza nią nie
        private const val puPu = "Dostępne tylko w klasie"
    }

    fun retPu(): String {
        return puPu
    }

    // lateinit - deklaracja zmiennej bez jej inicjalizowania
    lateinit var przypiszeValuePotem: String

}

// a tak się tworzy zazwyczaj plik z constantsami
object Constants {
    const val ROW_BASIC: Boolean = true
}
