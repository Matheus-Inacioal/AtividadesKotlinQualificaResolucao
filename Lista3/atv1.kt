 // Este programa solicita ao usuário que insira dois números e, em seguida, imprime o maior deles.

fun main() {
    // Solicita ao usuário para inserir o primeiro número
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toDouble() // Lê o número inserido pelo usuário e converte para Double

    // Solicita ao usuário para inserir o segundo número
    println("Digite o segundo número:")
    val num2 = readLine()!!.toDouble() // Lê o número inserido pelo usuário e converte para Double

    // Compara os números e imprime o resultado
    if (num1 > num2) {
        println("$num1 é maior que $num2") // Imprime a mensagem com o valor do primeiro número
    } else if (num2 > num1) {
        println("$num2 é maior que $num1") // Imprime a mensagem com o valor do segundo número
    } else {
        println("Os números são iguais.") // Imprime se os números forem iguais
    }
}

