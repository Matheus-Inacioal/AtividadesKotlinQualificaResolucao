//VerificarTodosPositivos

// Função que recebe uma lista de números inteiros e verifica se todos são positivos
fun verificarTodosPositivos(lista: List<Int>): Boolean {
    return lista.all { it > 0 }
}

fun main() {
    val numeros = listOf(10, 20, 5, 8, 15) // Exemplo de lista de números inteiros

    val todosPositivos = verificarTodosPositivos(numeros)
    val mensagem = if (todosPositivos) "são" else "não são"
    println("Todos os números na lista $mensagem positivos.")
}
