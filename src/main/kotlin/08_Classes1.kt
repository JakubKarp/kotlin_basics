fun main() {
    // klasy w kotlinie - podstawy

    // ponieważ klasa user jest w tym samym projekcie, nie trzeba robić importu, Kotlin to widzi

    var user = User()
    user.name = "Ala"
    user.age = 23
    user.printUser()
    user.printNameWithPrefix("Ms.")
    user.updateName("NewAla")
    println( "Now we have new name: ${user.name}")

    var friend = User()
    friend.name = "Ela"
    friend.age = 24
    friend.printUser()
    friend.printNameWithPrefix("Ms.")

    var user2 = UserWithConstructor (name = "John", surname = "Doe")
    user2.printFullName()

}

