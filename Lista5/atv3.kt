//Crie um programa que peça ao usuário para digitar 10 números inteiros e armazene-os em um array. Em seguida, exiba o menor número no array.

fun main() {
    val tamanhoArray = 10 // Tamanho do array
    val numeros = IntArray(tamanhoArray) // Cria um array de inteiros

    println("Digite $tamanhoArray números inteiros:")

    // Lê os números do usuário e armazena-os no array
    for (i in 0 until tamanhoArray) {
        numeros[i] = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário
    }

    // Encontra o menor número no array
    var menorNumero = numeros[0] // Inicializa a variável com o primeiro número do array

    for (numero in numeros) {
        if (numero < menorNumero) {
            menorNumero = numero // Atualiza o menor número, se necessário
        }
    }

    // Imprime o menor número no array
    println("O menor número no array é: $menorNumero")
}
