fun main() {
    // singleton - jak stworzyć wzorzec singleton w kotlinie

    // zawsze mamy tylko jedną instancję
    println(FavoriteFood.name)
    FavoriteFood.name = "Duck"
    println(FavoriteFood.name)
    rabbit()
    println(FavoriteFood.name)

    // w pamięci to jest jedno miejsce przechowywania danych
    println(FavoriteFood === FavoriteFood)
}

fun rabbit() {
    FavoriteFood.name = "rabbit"
}

// używając słowa class może stworzyć dowolną liczbę instancji tej klasy
// class FavoriteFood {
// jeśli chcemy singletona - czyli mamy możliwość stworzenia dokładnie tylko jednej instancji
// wtedy używamy słowa kluczowego object
object FavoriteFood {
    var name: String = "unknown"
    var weight: Int = 0

}
