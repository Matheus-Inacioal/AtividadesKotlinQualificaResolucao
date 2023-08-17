 //Crie um programa que peça ao usuário para digitar uma frase e armazene cada palavra em um elemento de um array. Em seguida, exiba a frase com as palavras na ordem inversa.

 fun main() {
    println("Digite uma frase:")
    val frase = readLine()!! // Lê a frase inserida pelo usuário

    // Divide a frase em palavras usando o espaço como delimitador
    val palavras = frase.split(" ").toTypedArray()

    // Inverte a ordem das palavras
    palavras.reverse()

    // Cria a frase invertida juntando as palavras com espaços
    val fraseInvertida = palavras.joinToString(" ")

    // Imprime a frase com as palavras na ordem inversa
    println("Frase com as palavras na ordem inversa:")
    println(fraseInvertida)
}
