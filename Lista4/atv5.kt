 // Este programa lê um número inteiro do usuário e imprime a tabuada desse número utilizando um loop for.

fun main() {
    // Solicita ao usuário para inserir um número inteiro
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

    // Usa um loop for para calcular e imprimir a tabuada do número inserido
    for (i in 1..10) {
        val resultado = numero * i // Calcula o resultado da multiplicação
        println("$numero x $i = $resultado")
    }
}
