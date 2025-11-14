package `07_Nulos`

fun main() {

    var a: String? = null

    // Elvis operator
    val result: String = a ?: "1"

    println(result)

    var b: Int = -1

    b = a?.toInt() ?: 0

    println(b)

    println(a!!.toInt())

}
