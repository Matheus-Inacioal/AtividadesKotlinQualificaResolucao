 // Este programa solicita ao usuário que insira sua idade e se é estudante, e imprime uma mensagem correspondente.

fun main() {
    // Solicita ao usuário para inserir a idade
    println("Digite sua idade:")
    val idade = readLine()!!.toInt() // Lê a idade inserida pelo usuário e converte para Int

    // Solicita ao usuário para inserir se é estudante
    println("Você é estudante? (sim/não)")
    val estudante = readLine()!!.equals("sim", ignoreCase = true) // Lê a resposta e verifica se é "sim" (ignorando maiúsculas e minúsculas)

    // Verifica a idade e se é estudante, e imprime a mensagem apropriada
    if (idade < 18 && !estudante) {
        println("Você é menor de idade e não é estudante.")
    } else {
        println("Você é maior de idade ou é estudante.")
    }
}
