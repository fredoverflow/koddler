import java.math.BigInteger

// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 ...

fun main() {
    println(fib(10, ""))
}

fun fib(n: Int, chain: String): BigInteger {
    val chain = "$chain $n"
    println(chain)
    return when (n) {
        0 -> BigInteger.ZERO
        1 -> BigInteger.ONE
        else -> {
            val a = fib(n - 2, chain)
            val b = fib(n - 1, chain)
            println(chain)
            a + b
        }
    }
}
