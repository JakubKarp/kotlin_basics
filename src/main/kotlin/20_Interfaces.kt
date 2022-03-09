fun main() {
    // interfejsy
    // interfejs jest kontraktem, co możemy dla ciebie zrobić

    var toy = GenericToy(true)
    toy.discountPercent()
}

interface Discountable {
    var hasDiscount: Boolean
    fun discountPercent(): Double
}

class GenericToy(override var hasDiscount: Boolean): Discountable {
    override fun discountPercent(): Double {
        val d: Double = 68.45
        println("this toy has discount $hasDiscount equal to $d")
        return d
    }
}

