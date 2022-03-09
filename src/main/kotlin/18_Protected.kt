fun main() {
    // protected and inheritance, and internal classes
    val rab1 = Rabbit("red", 2)
    val rab2 = GreenRabbit("green", 1, "green carrot")

    rab1.printFood()
    // mamy dostęp do metod z klasy, którą rozszerzamy
    rab2.printFood()
    rab2.setGreenFood("blue carrot")
    rab1.printFood()
    rab2.printFood()
    // jak widać, da się nadpisać wartość protected, ale wyłącznie w klasie rozszerzającej
}

// słowo kluczowe open pozwala rozszerzać klasę
open class Rabbit(var name: String, var age: Int) {
    // Słowo kluczowe protected powoduje, że food nie jest widoczne poza tą klasą.
    // Słowo "protected" może również dotyczyć metod, funkcji w klasie
    protected var food = "red carrot"
    fun printFood() {
        println("$name likes $food")
    }
}

// rozszerzamy klasę, warto zwrócić uwagę na syntax i konstruktor klasy rozszerzającej
class GreenRabbit(name: String, age: Int, bestFood: String) : Rabbit(name, age) {
    init {
        // pomimo że food jest protected, mamy do tego dostęp, bo rozszerzamy klasę Rabbit
        food = bestFood
    }
    fun setGreenFood(greenFood: String) {
        food = greenFood
    }
}

// Jeśli użyjemy słowa internal, klasa nie będzie dostępna na zewnątrz.
// Możemy jej użyć w innej klasie, ale nie metod czy wartości z niej bezpośrednio
// Nie da się do metod i wartości odnieść na zewnątrz
// internal class Something()