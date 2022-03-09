fun main() {
    // nested classes

    val car1 = Vehicle.TypeOfFuel()
    car1.vehicleFuel()

    // jeśli klasa wewnętrzna ma dostęp fo tej zewnętrznej, to już tak nie możemy wywołać:
    // val car = Vehicle.TypeOfVehicle()
    // trzeba najpierw to zewnętrzną
    val car = Vehicle()
    val car2 = car.TypeOfVehicle()
    car2.vehicleTypeFunc()

}

class Vehicle {

    var brand = "Opel"

    class TypeOfFuel {
        var fuel = "diesel"
        fun vehicleFuel() = println(fuel)
    }

    // w nested class nie ma dostępu do zmiennej brand
    // więc wewnątrz tej klasy nie da się zrobić tego:
    // var carBrand = brand
    // dopiero dodanie słowa kluczowego inner przed klasą daje dostęp do tego scope
    // zmienia się też sposób wywołania - patrz w main()
    inner class TypeOfVehicle {
        var vehicleType = "combi"
         var carBrand = brand
        fun vehicleTypeFunc() = println("car: $carBrand, and type: $vehicleType")
    }
}

