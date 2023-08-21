//OrdenarCrescente

// Função que recebe uma lista de números inteiros e retorna uma nova lista ordenada em ordem crescente
fun ordenarCrescente(lista: List<Int>): List<Int> {
    return lista.sorted()
}

fun main() {
    val numeros = listOf(15, 8, 20, 5, 10) // Exemplo de lista de números inteiros

    val numerosOrdenados = ordenarCrescente(numeros)
    println("Números em ordem crescente: $numerosOrdenados")
}
