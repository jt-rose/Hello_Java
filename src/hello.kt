import kotlin.jvm.JvmStatic

object hello {
    fun doubly(x: Int): Int {
        return x + x
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val doubled = doubly(10)
        println(doubled)
    }
}