//Escreva um programa que pede ao usuário para digitar dois números e imprima o maior dos dois.

fun main() {
    // Solicita ao usuário para digitar o primeiro número
    println("Digite o primeiro número:")
    val numero1 = readLine()?.toDoubleOrNull()

    // Solicita ao usuário para digitar o segundo número
    println("Digite o segundo número:")
    val numero2 = readLine()?.toDoubleOrNull()

    // Verifica se ambos os números foram inseridos corretamente
    if (numero1 != null && numero2 != null) {
        // Compara os números para determinar o maior
        val maior = if (numero1 > numero2) {
            numero1
        } else {
            numero2
        }

        // Imprime o maior número encontrado
        println("O maior número é: $maior")
    } else {
        // Imprime mensagem de erro se os números não forem válidos
        println("Entrada inválida. Digite valores válidos.")
    }
}
