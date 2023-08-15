//Escreva um programa que pede ao usuário para digitar um número e imprima se ele é par ou ímpar.

fun main() {
    // Solicita ao usuário para digitar um número
    println("Digite um número:")
    val numero = readLine()?.toIntOrNull()

    // Verifica se o número não é nulo
    if (numero != null) {
        // Verifica se o número é par
        if (numero % 2 == 0) {
            println("O número é par.")
        }
        // Caso contrário, o número é ímpar
        else {
            println("O número é ímpar.")
        }
    } else {
        // Imprime mensagem de erro se a entrada não for válida
        println("Entrada inválida. Digite um número válido.")
    }
}
