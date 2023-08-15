 // Este programa solicita ao usuário que insira seu salário e imprime o valor com um desconto de 10%.

fun main() {
    // Solicita ao usuário para inserir o salário
    println("Digite o valor do salário:")
    val salario = readLine()!!.toDouble() // Lê o salário inserido pelo usuário e converte para Double

    // Calcula o salário com desconto de 10%
    val salarioComDesconto = salario * 0.9

    // Imprime o salário com desconto
    println("Salário com desconto de 10%: $salarioComDesconto")
}
