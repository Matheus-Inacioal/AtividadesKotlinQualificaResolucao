//ContarStringsLongas

// Função que recebe uma lista de strings e retorna a quantidade de elementos com mais de 5 caracteres
fun contarStringsLongas(lista: List<String>): Int {
    return lista.count { it.length > 5 }
}

fun main() {
    val palavras = listOf("cachorro", "gato", "elefante", "passarinho", "cobra") // Exemplo de lista de strings

    val quantidade = contarStringsLongas(palavras)
    println("A quantidade de palavras com mais de 5 caracteres é: $quantidade")
}
