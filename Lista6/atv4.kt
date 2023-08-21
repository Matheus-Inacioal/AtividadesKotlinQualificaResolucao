//CalcularMedia

// Função que recebe uma lista de números inteiros e retorna a média aritmética
fun calcularMedia(lista: List<Int>): Double {
    return lista.average()
}

fun main() {
    val numeros = listOf(10, 20, 30, 40, 50) // Exemplo de lista de números inteiros

    val media = calcularMedia(numeros)
    println("A média dos números é $media")
}
