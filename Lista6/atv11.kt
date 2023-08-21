//SegundoMaior

// Função que recebe uma lista de números inteiros e retorna o segundo maior valor
fun segundoMaior(lista: List<Int>): Int? {
    if (lista.size < 2) return null
    val listaOrdenada = lista.sorted()
    return listaOrdenada[listaOrdenada.size - 2]
}

fun main() {
    val numeros = listOf(10, 15, 8, 20, 5) // Exemplo de lista de números inteiros

    val segundoMaiorValor = segundoMaior(numeros)
    if (segundoMaiorValor != null) {
        println("O segundo maior valor é: $segundoMaiorValor")
    } else {
        println("Não há segundo maior valor.")
    }
}
