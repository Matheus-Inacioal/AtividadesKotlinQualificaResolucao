 //Crie um programa que peça ao usuário para digitar 5 nomes e armazene-os em um array. Em seguida, exiba os nomes em ordem alfabética.

 fun main() {
    val tamanhoArray = 5 // Tamanho do array
    val nomes = Array(tamanhoArray) { "" } // Cria um array de strings

    println("Digite $tamanhoArray nomes:")

    // Lê os nomes do usuário e armazena-os no array
    for (i in 0 until tamanhoArray) {
        nomes[i] = readLine()!! // Lê o nome inserido pelo usuário
    }

    // Ordena os nomes em ordem alfabética
    nomes.sort()

    // Imprime os nomes em ordem alfabética
    println("Nomes em ordem alfabética:")
    for (nome in nomes) {
        println(nome)
    }
}
