//VerificarPrimo

// Função que recebe um número inteiro e verifica se é primo
fun verificarPrimo(numero: Int): Boolean {
    if (numero <= 1) return false
    for (i in 2 until numero) {
        if (numero % i == 0) return false
    }
    return true
}

fun main() {
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt()

    val resultado = if (verificarPrimo(numero)) "é primo" else "não é primo"
    println("O número $numero $resultado")
}
