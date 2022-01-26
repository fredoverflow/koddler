import java.math.BigInteger

// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 ...

fun main() {
    println(fib1(10))
}

fun fib1(n: Int): BigInteger {
    return fib3(n, BigInteger.ZERO, BigInteger.ONE)
}

fun fib3(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    println("fib($n, $a, $b)")
    if (n == 0) {
        countStackFrames()
        return a
    } else {
        return fib3(n - 1, b, a + b)
    }
}

fun countStackFrames() {
    val trace = Thread.currentThread().stackTrace
    println(trace.size)
    for (entry in trace.groupingBy { it }.eachCount()) {
        println(entry)
    }
}
