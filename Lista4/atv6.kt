// Este programa lê um número inteiro do usuário e imprime seus divisores utilizando um loop while.

fun main() {
    // Solicita ao usuário para inserir um número inteiro
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

    var divisor = 1 // Inicializa o divisor com 1

    // Usa um loop while para encontrar e imprimir os divisores do número inserido
    println("Divisores de $numero:")
    while (divisor <= numero) {
        if (numero % divisor == 0) {
            println(divisor)
        }
        divisor++
    }
}
