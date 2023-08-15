// Este programa lê um número inteiro do usuário e imprime se ele é um número perfeito ou não utilizando um loop while.

fun main() {
    // Solicita ao usuário para inserir um número inteiro
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

    var somaDivisores = 0 // Inicializa a variável para a soma dos divisores

    var divisor = 1 // Inicializa o divisor com 1

    // Calcula a soma dos divisores próprios do número usando um loop while
    while (divisor < numero) {
        if (numero % divisor == 0) {
            somaDivisores += divisor // Adiciona o divisor à soma
        }
        divisor++
    }

    // Imprime se o número é um número perfeito ou não
    if (somaDivisores == numero) {
        println("$numero é um número perfeito.")
    } else {
        println("$numero não é um número perfeito.")
    }
}
