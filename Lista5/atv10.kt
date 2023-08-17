 //Crie um programa que peça ao usuário para digitar 10 números inteiros e armazene-os em um array. Em seguida, remova os números duplicados e exiba o array resultante.

fun main() {
    val tamanhoArray = 10 // Tamanho do array
    val numeros = IntArray(tamanhoArray) // Cria um array de inteiros

    println("Digite $tamanhoArray números inteiros:")

    // Lê os números do usuário e armazena-os no array
    for (i in 0 until tamanhoArray) {
        numeros[i] = readLine()!!.toInt() // Lê o número inteiro inserido pelo usuário
    }

    // Cria um set para armazenar os números únicos (sem duplicatas)
    val numerosUnicos = numeros.toSet()

    // Converte o set de números únicos de volta para um array
    val numerosSemDuplicatas = numerosUnicos.toIntArray()

    // Imprime o array resultante sem duplicatas
    println("Array resultante sem números duplicados:")
    for (numero in numerosSemDuplicatas) {
        println(numero)
    }
}
