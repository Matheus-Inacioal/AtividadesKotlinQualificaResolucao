//MultiplicarPor2

// Função que recebe uma lista de números inteiros e retorna uma nova lista com os valores multiplicados por 2
fun multiplicarPor2(lista: List<Int>): List<Int> {
    return lista.map { it * 2 }
}

fun main() {
    val numeros = listOf(5, 10, 15, 20, 25) // Exemplo de lista de números inteiros

    val numerosMultiplicados = multiplicarPor2(numeros)
    println("Números multiplicados por 2: $numerosMultiplicados")
}

