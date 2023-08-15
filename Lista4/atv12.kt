// Este programa lê um número inteiro do usuário e imprime sua representação binária utilizando um loop while.

fun main() {
    // Solicita ao usuário para inserir um número inteiro
    println("Digite um número inteiro:")
    var numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

    var representacaoBinaria = "" // Inicializa a string para a representação binária

    // Converte o número inteiro para representação binária usando um loop while
    while (numero > 0) {
        val resto = numero % 2 // Calcula o resto da divisão por 2
        representacaoBinaria = "$resto$representacaoBinaria" // Adiciona o resto à representação binária
        numero /= 2 // Divide o número inteiro por 2
    }

    // Imprime a representação binária
    println("A representação binária do número é: $representacaoBinaria")
}
