 //Crie um programa que peça ao usuário para digitar 10 números inteiros e armazene-os em um array. Em seguida, exiba os números em ordem crescente.

 fun main() {
    val tamanhoArray = 10 // Tamanho do array
    val numeros = IntArray(tamanhoArray) // Cria um array de inteiros

    println("Digite $tamanhoArray números inteiros:")

    // Lê os números do usuário e armazena-os no array
    for (i in 0 until tamanhoArray) {
        numeros[i] = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário
    }

    // Ordena os números em ordem crescente
    numeros.sort()

    // Imprime os números em ordem crescente
    println("Números em ordem crescente:")
    for (numero in numeros) {
        println(numero)
    }
}
