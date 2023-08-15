// Este programa verifica se um número inteiro é primo ou não sem utilizar o break.

fun main() {
    // Solicita ao usuário para inserir um número inteiro
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

    var ehPrimo = true // Inicializa a variável como verdadeira

    // Verifica se o número é primo ou não
    if (numero <= 1) {
        ehPrimo = false // Números menores ou iguais a 1 não são primos
    } else {
        for (divisor in 2 until numero) {
            if (numero % divisor == 0) {
                ehPrimo = false // Se o número é divisível por algum divisor, não é primo
            }
        }
    }

    // Imprime se o número é primo ou não
    if (ehPrimo) {
        println("$numero é um número primo.")
    } else {
        println("$numero não é um número primo.")
    }
}
