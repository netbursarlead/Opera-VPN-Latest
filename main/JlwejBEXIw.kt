fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = doubleEvenNumbers(numbers)
    println(result)
}
fun doubleEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.map { if (it % 2 == 0) it * 2 else it }
}
fun filterGreaterThan(numbers: List<Int>, threshold: Int): List<Int> {
    return numbers.filter { it > threshold }
}
fun sumOfNumbers(numbers: List<Int>): Int {
    return numbers.sum()
}
fun averageOfNumbers(numbers: List<Int>): Double {
    return if (numbers.isNotEmpty()) numbers.average() else 0.0
}
fun findMax(numbers: List<Int>): Int? {
    return numbers.maxOrNull()
}
fun findMin(numbers: List<Int>): Int? {
    return numbers.minOrNull()
}
fun countOccurrences(numbers: List<Int>, target: Int): Int {
    return numbers.count { it == target }
}
fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}
fun primeNumbersInRange(start: Int, end: Int): List<Int> {
    return (start..end).filter { isPrime(it) }
}
fun mainStatistics(numbers: List<Int>): Map<String, Any> {
    return mapOf(
        "sum" to sumOfNumbers(numbers),
        "average" to averageOfNumbers(numbers),
        "max" to findMax(numbers),
        "min" to findMin(numbers)
    )
}
fun main() {
    val numbers = listOf(10, 20, 30, 40)
    val stats = mainStatistics(numbers)
    println(stats)
}
