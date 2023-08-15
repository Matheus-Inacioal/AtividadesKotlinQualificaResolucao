 // Este programa solicita ao usuário que insira seu nome e idade, e imprime se é menor ou maior de idade.

fun main() {
    // Solicita ao usuário para inserir o nome
    println("Digite seu nome:")
    val nome = readLine()!! // Lê o nome inserido pelo usuário

    // Solicita ao usuário para inserir a idade
    println("Digite sua idade:")
    val idade = readLine()!!.toInt() // Lê a idade inserida pelo usuário e converte para Int

    // Verifica se a idade é menor que 18 e imprime a mensagem apropriada
    if (idade < 18) {
        println("Você é menor de idade, $nome.")
    } else {
        println("Você é maior de idade, $nome.")
    }
}
