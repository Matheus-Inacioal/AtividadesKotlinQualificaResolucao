//DecimalParaBinario

// Função que recebe um número inteiro e retorna a sua representação em binário
fun decimalParaBinario(numero: Int): String {
    return Integer.toBinaryString(numero)
}

fun main() {
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt()

    val binario = decimalParaBinario(numero)
    println("O número $numero em binário é $binario")
}
