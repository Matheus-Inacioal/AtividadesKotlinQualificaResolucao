// Este programa lê vários números inteiros do usuário até que o número 0 seja digitado e imprime o segundo maior número lido utilizando um loop for.

fun main() {
    var maiorNumero = Int.MIN_VALUE // Inicializa a variável do maior número com o menor valor possível
    var segundoMaiorNumero = Int.MIN_VALUE // Inicializa a variável do segundo maior número com o menor valor possível

    println("Digite vários números inteiros (ou 0 para sair):")

    var numero: Int
    do {
        numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

        if (numero > maiorNumero) {
            segundoMaiorNumero = maiorNumero // O atual maior número se torna o segundo maior
            maiorNumero = numero // Atualiza o maior número
        } else if (numero > segundoMaiorNumero && numero < maiorNumero) {
            segundoMaiorNumero = numero // Atualiza o segundo maior número
        }
    } while (numero != 0)

    // Imprime o segundo maior número lido
    if (segundoMaiorNumero != Int.MIN_VALUE) {
        println("O segundo maior número lido foi: $segundoMaiorNumero")
    } else {
        println("Nenhum número válido foi lido.")
    }
}
