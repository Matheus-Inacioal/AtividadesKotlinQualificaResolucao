 // Este programa solicita ao usuário que insira um número e, em seguida, imprime se é positivo, negativo ou zero.

fun main() {
    // Solicita ao usuário para inserir um número
    println("Digite um número:")
    val num = readLine()!!.toDouble() // Lê o número inserido pelo usuário e converte para Double

    // Verifica se o número é positivo, negativo ou zero e imprime o resultado
    if (num > 0) {
        println("O número é positivo.")
    } else if (num < 0) {
        println("O número é negativo.")
    } else {
        println("O número é zero.")
    }
}
