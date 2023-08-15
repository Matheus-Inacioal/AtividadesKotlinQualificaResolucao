//Escreva um programa que pede ao usuário para digitar sua idade e imprima se a pessoa é maior ou menor de idade.

fun main() {
    // Solicita ao usuário para digitar sua idade
    println("Digite sua idade:")
    val idade = readLine()?.toIntOrNull()

    // Verifica se a idade não é nula
    if (idade != null) {
        // Verifica se a idade é maior ou igual a 18 (maioridade)
        if (idade >= 18) {
            println("Você é maior de idade.")
        }
        // Caso contrário, a pessoa é menor de idade
        else {
            println("Você é menor de idade.")
        }
    } else {
        // Imprime mensagem de erro se a entrada não for válida
        println("Entrada inválida. Digite uma idade válida.")
    }
}
