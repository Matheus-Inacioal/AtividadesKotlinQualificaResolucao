fun main() {
    val numbers = mutableListOf<Int>()

    println("Digite uma série de números separados por espaços (ou '0' para sair):")

    while (true) {
        val input = readLine()
        if (input == "0") {
            break
        }

        val number = input?.toIntOrNull()
        if (number != null) {
            numbers.add(number)
        } else {
            println("Entrada inválida. Por favor, digite um número válido ou 'q' para sair.")
        }
    }

    if (numbers.isEmpty()) {
        println("Nenhum número foi inserido.")
    } else {
        println("Média: ${calculateAverage(numbers)}")
        val (max, min) = findMaxAndMin(numbers)
        println("Maior número: $max")
        println("Menor número: $min")
        val (evenCount, oddCount) = countEvenAndOdd(numbers)
        println("Quantidade de números pares: $evenCount")
        println("Quantidade de números ímpares: $oddCount")
    }
}

fun calculateAverage(numbers: List<Int>): Double {
    val sum = numbers.sum()
    return sum.toDouble() / numbers.size
}

fun findMaxAndMin(numbers: List<Int>): Pair<Int, Int> {
    val max = numbers.maxOrNull() ?: Int.MIN_VALUE
    val min = numbers.minOrNull() ?: Int.MAX_VALUE
    return Pair(max, min)
}

fun countEvenAndOdd(numbers: List<Int>): Pair<Int, Int> {
    val evenCount = numbers.count { it % 2 == 0 }
    val oddCount = numbers.size - evenCount
    return Pair(evenCount, oddCount)
}
