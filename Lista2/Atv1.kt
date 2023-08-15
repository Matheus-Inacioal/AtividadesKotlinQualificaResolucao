//Escreva um programa que pede ao usuário para digitar um número e imprima se o número é positivo ou negativo.

fun main() {
    // Solicita ao usuário para digitar um número
    println("Digite um número:")
    val numero = readLine()?.toDoubleOrNull()

    // Verifica se o número não é nulo
    if (numero != null) {
        // Verifica se o número é maior que zero (positivo)
        if (numero > 0) {
            println("O número é positivo.")
        }
        // Verifica se o número é menor que zero (negativo)
        else if (numero < 0) {
            println("O número é negativo.")
        }
        // Se o número não é positivo nem negativo, é zero
        else {
            println("O número é zero.")
        }
    } else {
        // Imprime mensagem de erro se a entrada não for válida
        println("Entrada inválida. Digite um número válido.")
    }
}
