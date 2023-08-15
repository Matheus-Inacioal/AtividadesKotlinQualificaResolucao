// Este programa utiliza um loop do-while para imprimir os números ímpares de 1 a 15.

fun main() {
    var numero = 1 // Inicializa a variável número com 1

    // Usa um loop do-while para imprimir os números ímpares de 1 a 15
    do {
        println(numero) // Imprime o número ímpar atual
        numero += 2 // Incrementa o valor da variável número por 2 para obter o próximo número ímpar
    } while (numero <= 15)
}

