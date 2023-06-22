class MAM(private val name: String, private val gender: String, private val phone: Int)// contructor
 {
    fun displayInformation() {
        println("Name=$name")
        println("Gender=$gender")
        println("Phone=$phone")
    }
}

fun main() {
    val teacher1 = MAM("Irfanul kabir hira", "male", 14324342)
    teacher1.displayInformation()

    println()

    val teacher2 = MAM("Tasnuba humaira", "male", 1615099989)
    teacher2.displayInformation()
}
