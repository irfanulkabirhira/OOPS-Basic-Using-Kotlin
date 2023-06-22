class Heda {
    var name: String = ""
    var gender: String = ""
    var phone: Int = 0

    constructor() { // default constructor
        println("No value")
    }

    constructor(n: String, m: String, ph: Int) { // parameterized constructor
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
    val teacher1 = Heda("Irfanul kabir hira", "male", 1625980062)
    teacher1.displayInformation()

    println()

    val teacher2 = Heda("Tasnuba humaira", "male", 1615099989)
    teacher2.displayInformation()

    println()

    val teacher3 = Heda()
    teacher3.displayInformation()
}
