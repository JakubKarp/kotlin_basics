// what class is? it is reusable template
class User {
    var name: String = ""
    var age: Int = 0

    fun printUser() {
        println("$name and $age")
    }

    fun printNameWithPrefix(prefix: String) {
        println("$prefix $name")
    }

    fun updateName(newName: String) {
        name = newName
        println(name)
    }
}

// constructor
// można zapisać ze słowem: constructor lub bez
// class UserWithConstructor(val name: String, val surname: String) {

// do konstruktora można podać defaultową wartość
class UserWithConstructor(val name: String, val surname: String = "Smith") {

    fun printFullName() {
        println("user with constructor is $name $surname")
    }
}