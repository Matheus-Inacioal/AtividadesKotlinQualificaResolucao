 // Este programa solicita ao usuário que insira três números e utiliza condicionais para imprimir o maior deles.

fun main() {
    // Solicita ao usuário para inserir o primeiro número
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toDouble() // Lê o número inserido pelo usuário e converte para Double

    // Solicita ao usuário para inserir o segundo número
    println("Digite o segundo número:")
    val num2 = readLine()!!.toDouble() // Lê o número inserido pelo usuário e converte para Double

    // Solicita ao usuário para inserir o terceiro número
    println("Digite o terceiro número:")
    val num3 = readLine()!!.toDouble() // Lê o número inserido pelo usuário e converte para Double

    // Verifica qual é o maior número usando condicionais
    val maiorNumero = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    // Imprime o maior número
    println("O maior número é $maiorNumero")
}

