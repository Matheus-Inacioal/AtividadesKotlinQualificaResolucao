 // Este programa lê vários números inteiros do usuário até que o número 0 seja digitado e imprime a média dos números lidos utilizando um loop do-while.

fun main() {
    var soma = 0 // Inicializa a variável soma com 0
    var contador = 0 // Inicializa o contador com 0
    var numero: Int

    // Usa um loop do-while para ler os números e calcular a soma
    do {
        println("Digite um número inteiro (ou 0 para sair):")
        numero = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário

        if (numero != 0) {
            soma += numero // Adiciona o número à soma
            contador++ // Incrementa o contador
        }
    } while (numero != 0)

    // Calcula a média dos números lidos
    val media = if (contador > 0) soma.toDouble() / contador else 0.0

    // Imprime a média
    println("A média dos números lidos é $media")
}
