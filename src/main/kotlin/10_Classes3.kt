fun main() {
    // klasy w kotlinie - właściwości oraz gettery i settery

   var animal03 = Animal02("woo", "doo")
   println(animal03.legs)
   // legs zadeklarowane z var - można nadpisać
   animal03.legs = "no"
   println(animal03.legs)

   // head zadeklarowane z val - nie można nadpisać
   // animal03.head = "no"

   // getter
   println(animal03.ear)
   // odpala setter
   animal03.ear = "no"
   println(animal03.ear)
   // i odpala setter ale na else
    animal03.ear = "ups"
    println(animal03.ear)
}


class Animal02(var hau: String, var name: String) {

    var legs = "has"
    val head = "has"
    init {
        println("init 1 $legs")
    }

    var ear = "has"
    // tak zadeklarowany jawnie getter nadpisuje wartość samej zmiennej
    // słowo kluczowe field odnosi się do tej zmiennej
        get() = "this dog $field ear"
    // setter z kolei ustawia wartość
        set(value) {
            field = if (value.startsWith("no")) {
                "has $value"
            } else {
                value
            }
        }

}
