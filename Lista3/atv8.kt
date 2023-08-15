 // Este programa solicita ao usuário que insira uma letra e imprime se é uma vogal ou uma consoante.

fun main() {
    // Solicita ao usuário para inserir uma letra
    println("Digite uma letra:")
    val letra = readLine()!![0].toLowerCase() // Lê a letra inserida pelo usuário e a converte para minúscula

    // Verifica se a letra é uma vogal ou uma consoante e imprime o resultado
    if (letra in setOf('a', 'e', 'i', 'o', 'u')) {
        println("A letra é uma vogal.")
    } else {
        println("A letra é uma consoante.")
    }
}
