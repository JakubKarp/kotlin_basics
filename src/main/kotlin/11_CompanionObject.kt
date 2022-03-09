fun main() {
    // companion object - metoda wywoływana bezpośrednio na klasie

    var zed = Animal03.hey("Ala", "Kow")
    println(zed)

    var zed2 = Animal03("Ula", "Bow")
    println(zed2.name)
}


class Animal03(var name: String, var surname: String) {

    companion object {
        fun hey(name: String, surname: String): String {
            return "her name is $name, and surname: $surname"
        }
    }

}
