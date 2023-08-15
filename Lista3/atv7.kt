// Este programa solicita ao usuário que insira um número e imprime se é par ou ímpar.

fun main() {
    // Solicita ao usuário para inserir um número
    println("Digite um número:")
    val num = readLine()!!.toInt() // Lê o número inserido pelo usuário e converte para Int

    // Verifica se o número é par ou ímpar e imprime o resultado
    if (num % 2 == 0) {
        println("O número é par.")
    } else {
        println("O número é ímpar.")
    }
}
