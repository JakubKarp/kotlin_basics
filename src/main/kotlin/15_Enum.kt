fun main() {
    // enum in kotlin classes

    println(AccountType.GOLD)

    // jak pracować z API
    val accountTypeFromAPI = "gold"
    val goldType = AccountType.valueOf(accountTypeFromAPI.uppercase())
    println(goldType)
    println(goldType == AccountType.GOLD)

    //enum z wartościami
    println(Size.BIG)
    println(Size.BIG.howMuch)
    println(Size.BIG.stars)

    // enum z wyliczalną funkcją abstrakcyjną
    val calculated = CalculateSomething.YES
    println(calculated.calculatePercent())

    // jak iterować po enum
    for (aType in AccountType.values()) {
        println(aType)
    }
    // a krócej można zapisać
    AccountType.values().forEach { println(it) }


    // wywołanie static metody, która robi uppercase
    // to się przydaje, kiedy chcemy coś przetworzyć w enum
    val upperFromApi = CalculateSomething.returnUpperCased("YeS")
    println(upperFromApi)
}



enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}

// enumom można też przypisywać wartości
// należy dodać konstruktor
enum class Size(val howMuch: Int, val stars: Int) {
    BIG(50, 10),
    SMALL(20, 4)
}

// enum z abstract function
enum class CalculateSomething {
    YES {
        override fun calculatePercent(): String {
            // tu możesz wykonać dowolny kod
            return "oh yes"
        }
    },
    NO {
        override fun calculatePercent(): String {
            return "oh no"
        }
    };

    // abstract fun, którą potem nadpisujemy przy każdym elemencie enum
    abstract fun calculatePercent(): String

    // można też static method dodać do enum
    companion object {
        fun returnUpperCased(name: String) = valueOf(name.uppercase())
    }
}

