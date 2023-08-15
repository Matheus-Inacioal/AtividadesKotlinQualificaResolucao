// Este programa lê vários números inteiros do usuário até que o número 0 seja digitado e imprime a quantidade de números positivos e negativos lidos utilizando um loop for.

fun main() {
    var numerosPositivos = 0 // Inicializa a variável de contagem de números positivos
    var numerosNegativos = 0 // Inicializa a variável de contagem de números negativos

    println("Digite vários números inteiros (ou 0 para sair):")

    var numero: Int
    do {
        numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

        if (numero > 0) {
            numerosPositivos++ // Incrementa a contagem de números positivos
        } else if (numero < 0) {
            numerosNegativos++ // Incrementa a contagem de números negativos
        }
    } while (numero != 0)

    // Imprime a quantidade de números positivos e negativos lidos
    println("Quantidade de números positivos: $numerosPositivos")
    println("Quantidade de números negativos: $numerosNegativos")
}
