 //VerificarParImpar

// Função que recebe um número inteiro e verifica se ele é par ou ímpar, retornando uma mensagem indicando o resultado
fun verificarParOuImpar(numero: Int): String {
    return if (numero % 2 == 0) {
        "par"
    } else {
        "ímpar"
    }
}

fun main() {
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt()

    val resultado = verificarParOuImpar(numero)
    println("O número $numero é $resultado")
}
