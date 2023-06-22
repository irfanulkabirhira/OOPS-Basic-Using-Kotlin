class Overload {
    fun add(a: Int, b: Int) {
        println(a + b)
    }

    fun add(a: Double, b: Double) {
        println(a + b)
    }

    fun add(a: Int, b: Int, c: Int) {
        println(a + b + c)
    }

    fun add() {
        println("nothing to add")
    }
}

fun main() {
    val ob = Overload()
    ob.add()
    ob.add(5, 10)
    ob.add(6.5, 5.5)
    ob.add(5, 10, 20)
}
