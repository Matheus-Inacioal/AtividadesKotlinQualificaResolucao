fun main() {
    // Criando um array de números
    val numeros = arrayOf(1, 2, 3, 4, 5)

    // Imprimindo os números do array
    println("Array de números:")
    for (numero in numeros) {
        println(numero)
    }

    // Criando um array de nomes com elementos nulos
    val tamanhoArrayNomes = 5
    val nomes = arrayOfNulls<String>(tamanhoArrayNomes)

    // Solicitando ao usuário para inserir nomes para preencher o array de nomes
    println("\nDigite $tamanhoArrayNomes nomes para preencher o array:")
    for (i in 0 until tamanhoArrayNomes) {
        nomes[i] = readLine() // Lê o nome inserido pelo usuário
    }

    // Imprimindo os nomes do array
    println("\nArray de nomes:")
    for ((index, nome) in nomes.withIndex()) {
        println("[$index] $nome")
    }

    // Solicitando ao usuário um índice para buscar um nome no array
    println("\nDigite o índice do nome que deseja buscar:\n")
    val indiceBusca = readLine()!!.toInt()

    // Verificando se o índice é válido e imprimindo o nome correspondente
    if (indiceBusca in 0 until tamanhoArrayNomes) {
        val nomeBuscado = nomes[indiceBusca]
        println("Nome no índice $indiceBusca: $nomeBuscado")
    } else {
        println("Índice inválido.")
    }
}
