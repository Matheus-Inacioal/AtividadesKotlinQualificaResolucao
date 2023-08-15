 // Este programa lê vários números inteiros do usuário até que o número -1 seja digitado e imprime o maior número lido utilizando um loop do-while.

fun main() {
    println("Digite vários números inteiros (ou -1 para sair):")

    var numero: Int
    var primeiroNumero = true
    var maiorNumero = 0

    do {
        numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

        if (numero != -1) {
            if (primeiroNumero || numero > maiorNumero) {
                maiorNumero = numero // Atualiza o maior número, se necessário
                primeiroNumero = false
            }
        }
    } while (numero != -1)

    // Imprime o maior número lido
    if (!primeiroNumero) {
        println("O maior número lido foi: $maiorNumero")
    } else {
        println("Nenhum número válido foi lido.")
    }
}
