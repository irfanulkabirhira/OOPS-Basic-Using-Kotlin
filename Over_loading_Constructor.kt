class Kutta {
    var name: String = ""
    var gender: String = ""
    var phone: Int = 0

    constructor() { // default constructor
        println("No value")
    }

    constructor(n: String, m: String) { // constructor with two parameters
        name = n
        gender = m
    }

    constructor(n: String, m: String, ph: Int) { // constructor with three parameters
        name = n
        gender = m
        phone = ph
    }

    fun displayInformation() {
        println("Name=$name")
        println("Gender=$gender")
        println("Phone=$phone")
    }
}

fun main() {
    val teacher1 = Kutta("Irfanul kabir hira", "male")
    teacher1.displayInformation()

    println()

    val teacher2 = Kutta("Tasnuba humaira", "male", 1615099989)
    teacher2.displayInformation()

    println()

    val teacher3 = Kutta()
    teacher3.displayInformation()
}
