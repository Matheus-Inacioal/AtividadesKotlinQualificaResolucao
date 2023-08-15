//Escreva um programa que pede ao usuário para digitar uma letra e imprima se a letra é uma vogal ou consoante.

fun main() {
    // Solicita que o usuário digite uma letra
    println("Digite uma letra:")
    
    // Lê a entrada do usuário e armazena na variável 'letra'
    var letra = readLine()

    // Verifica se 'letra' não é nulo e tem comprimento igual a 1
    if (letra != null && letra.length == 1) {
        // Converte 'letra' para minúscula para facilitar a comparação
        letra = letra.toLowerCase()

        // Verifica se 'letra' é uma vogal ('a', 'e', 'i', 'o' ou 'u')
        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
            // Imprime mensagem se 'letra' for uma vogal
            println("A letra $letra é uma Vogal")
        } else {
            // Imprime mensagem se 'letra' for uma consoante
            println("A letra $letra é uma Consoante")
        }
    } else {
        // Imprime mensagem de erro se a entrada não for válida
        println("Entrada inválida. Digite apenas uma letra.")
    }
}
