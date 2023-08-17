//Crie um programa que peça ao usuário para digitar 5 palavras e armazene-os em um array. Em seguida, exiba a palavra mais curta no array.

fun main() {
    val tamanhoArray = 5 // Tamanho do array
    val palavras = Array(tamanhoArray) { "" } // Cria um array de strings

    println("Digite $tamanhoArray palavras:")

    // Lê as palavras do usuário e armazena-as no array
    for (i in 0 until tamanhoArray) {
        palavras[i] = readLine()!! // Lê a palavra inserida pelo usuário
    }

    // Encontra a palavra mais curta no array
    var palavraMaisCurta = palavras[0] // Inicializa a variável com a primeira palavra do array

    for (palavra in palavras) {
        if (palavra.length < palavraMaisCurta.length) {
            palavraMaisCurta = palavra // Atualiza a palavra mais curta, se necessário
        }
    }

    // Imprime a palavra mais curta no array
    println("A palavra mais curta no array é: $palavraMaisCurta")
}
