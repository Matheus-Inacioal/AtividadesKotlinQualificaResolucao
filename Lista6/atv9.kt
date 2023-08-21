//SomarPares

// Função que recebe uma lista de números inteiros e retorna a soma dos valores pares
fun somarPares(lista: List<Int>): Int {
    return lista.filter { it % 2 == 0 }.sum()
}

fun main() {
    val numeros = listOf(2, 5, 8, 10, 15, 20) // Exemplo de lista de números inteiros

    val somaPares = somarPares(numeros)
    println("A soma dos números pares é: $somaPares")
}
