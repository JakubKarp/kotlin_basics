fun main() {
    // when -  switch in js

    val type = WhenType("Ala")
    val cat = "Miau"

    when(type.name) {
        "Ala" -> {
            println("Elo ${type.name}")
        }
        // default
        else -> {
            println("No Ala")
        }
    }

    // można też
    when {
        type.name == "Ala" && cat == "Miau" -> println("Ala $cat")
        else -> println("no cat")
    }

    // lub tak
    // jeśli when coś zwraca - muszą być obsłużone wszystkie przypadki, inaczej nie skompiluje
    val colorType = AcType.GOLD
     val color = when(colorType) {
        AcType.GOLD -> "Gold color"
        AcType.PLATINUM -> "Platinum color"
        else -> "Other color"
    }
    println("color is: $color")


}

class WhenType(val name: String) {}

enum class AcType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}