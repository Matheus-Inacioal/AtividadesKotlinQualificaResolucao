//Crie um programa que peça ao usuário para digitar 5 números inteiros e armazene-os em um array. Em seguida, exiba a soma de todos os números no array.

fun main() {
    val tamanhoArray = 5 // Tamanho do array
    val numeros = IntArray(tamanhoArray) // Cria um array de inteiros

    println("Digite $tamanhoArray números inteiros:")

    // Lê os números do usuário e armazena-os no array
    for (i in 0 until tamanhoArray) {
        numeros[i] = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário
    }

    // Calcula a soma dos números no array
    var soma = 0
    for (numero in numeros) {
        soma += numero
    }

    // Imprime a soma dos números no array
    println("A soma dos números no array é: $soma")
}
