fun countEvenOdd(numbers: List<Int>): Pair<Int, Int> {
    var evenCount = 0
    var oddCount = 0
    
    for (num in numbers) {
        if (num % 2 == 0) {
            evenCount++ 
        } else {
            oddCount++   
        }
    }
    
    return Pair(evenCount, oddCount) 
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val (even, odd) = countEvenOdd(numbers)  
    println("Pares: $even, Impares: $odd")
}
