import java.math.BigInteger

// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 ...

fun main() {
    println(fib2(10, ""))
}

val cache = mutableMapOf(0 to BigInteger.ZERO,
                         1 to BigInteger.ONE)

fun fib2(n: Int, chain: String): BigInteger {
    val chain = "$chain $n"
    println(chain)
    return cache.getOrPut(n) {
        val a = fib2(n - 2, chain)
        val b = fib2(n - 1, chain)
        println(chain)
        a + b
    }
}
