// Este programa lê um número inteiro do usuário e imprime a soma de seus dígitos utilizando um loop do-while.

fun main() {
    // Solicita ao usuário para inserir um número inteiro
    println("Digite um número inteiro:")
    var numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

    var somaDigitos = 0 // Inicializa a variável para a soma dos dígitos

    // Calcula a soma dos dígitos usando um loop do-while
    do {
        val digito = numero % 10 // Obtém o último dígito do número
        somaDigitos += digito // Adiciona o dígito à soma
        numero /= 10 // Remove o último dígito do número
    } while (numero > 0)

    // Imprime a soma dos dígitos
    println("A soma dos dígitos do número é: $somaDigitos")
}
