class Sir {
    var name: String = ""
    var gender: String = ""
    var phone: Int = 0

    /*
     * process of making Method
     * return type must use that is (void) here
     */
    fun displayInformation() {
        println("Name=$name")
        println("Gender=$gender")
        println("Phone=$phone")
    }
}

fun main() {
    val teacher1 = Sir() // teacher1 is an object
    teacher1.name = "Irfanul kabir hira"
    teacher1.gender = "Male"
    teacher1.phone = 1615099989
    teacher1.displayInformation()

    println()

    val teacher2 = Sir() // teacher2 is an object
    teacher2.name = "Humaira Tasnuba"
    teacher2.gender = "Female"
    teacher2.phone = 1615099989
    teacher2.displayInformation()
}
