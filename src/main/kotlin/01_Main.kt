fun main() {
    println("Hello kotlin")

    var firstVariable = "hello from variable"
    println(firstVariable)

    firstVariable = "var czyli zmienna, którą można nadpisywać"
    println(firstVariable)

    // sprawdzamy czy zmienna a jest pusta - true/false
    firstVariable = ""
    println(firstVariable.isEmpty())

    val readOnlyVariable = "val - deklaracja zmiennej tylko do odczytu, coś w stylu const js"
    println(readOnlyVariable)

    // sprawdzanie typu zmiennej
    println(readOnlyVariable::class)

    // typ można zdeklarować jawnie
    val valTypeInfo: String = "zmienna typu string"
    println(valTypeInfo)

}