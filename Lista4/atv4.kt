 // Este programa utiliza um loop for para calcular e imprimir a soma dos números de 1 a 100.

fun main() {
    var soma = 0 // Inicializa a variável soma com 0

    // Usa um loop for para percorrer os números de 1 a 100 e calcular a soma
    for (numero in 1..100) {
        soma += numero // Adiciona o número atual à soma
    }

    // Imprime a soma total
    println("A soma dos números de 1 a 100 é $soma")
}
