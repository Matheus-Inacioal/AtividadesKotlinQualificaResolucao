//OrdenarAlfabetica

// Função que recebe uma lista de strings e retorna uma nova lista ordenada em ordem alfabética
fun ordenarAlfabetica(lista: List<String>): List<String> {
    return lista.sorted()
}

fun main() {
    val palavras = listOf("banana", "abacaxi", "laranja", "uva", "maçã") // Exemplo de lista de strings

    val palavrasOrdenadas = ordenarAlfabetica(palavras)
    println("Palavras em ordem alfabética: $palavrasOrdenadas")
}
