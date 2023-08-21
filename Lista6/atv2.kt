 //VerificarParImpar

// Função que recebe um número inteiro e verifica se é par ou ímpar
fun verificarParImpar(numero: Int): String {
    return if (numero % 2 == 0) {println("par")} else {println("ímpar")}
}

fun main() {
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt()

    val resultado = verificarParImpar(numero)
    println("O número $numero é $resultado")
}
