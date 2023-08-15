 // Este programa lê um número inteiro do usuário e imprime a sequência de Fibonacci até esse número utilizando um loop while.

fun main() {
    // Solicita ao usuário para inserir um número inteiro
    println("Digite um número inteiro:")
    val limite = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

    var numeroAnterior = 0
    var numeroAtual = 1

    // Imprime os números da sequência de Fibonacci até atingir o limite
    println("Sequência de Fibonacci até $limite:")
    while (numeroAtual <= limite) {
        println(numeroAtual)

        val proximoNumero = numeroAnterior + numeroAtual
        numeroAnterior = numeroAtual
        numeroAtual = proximoNumero
    }
}
