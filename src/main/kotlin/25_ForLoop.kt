fun main() {
    // for loop

    val values = listOf(1, 2, 3, 4)
    for (number in values) {
        println(number)
    }


    val start = 0
    for (nu in start  until 12 step 2) {
        println(nu)
    }

    for (nu2 in 20  downTo  10) {
        println(nu2)
    }

    for (nu3 in 1..3) {
        println(nu3)
    }

    val pupus = listOf<Pupu>(
        Pupu("gooo"),
        Pupu("wooo"),
        Pupu("looo"),
        Pupu("mooo")
    )

    for (pu in pupus) {
        println(pu.pu)
    }

}

data class Pupu(val pu: String)
