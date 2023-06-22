class Tuitor {
    var name: String = ""
    var gender: String = ""
    var phone: Int = 0

    fun setInformation(n: String, m: String, ph: Int) {
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
    val teacher1 = Tuitor()
    teacher1.setInformation("Irfanul kabir hira", "male", 12276463)
    teacher1.displayInformation()

    println()

    val teacher2 = Tuitor()
    teacher2.setInformation("Tasnuba Humaira", "female", 12276463)
    teacher2.displayInformation()
}
