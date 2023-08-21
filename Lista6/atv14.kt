//CalcularRaizQuadrada

// Função que recebe um número inteiro e retorna a sua raiz quadrada
fun calcularRaizQuadrada(numero: Int): Double {
    return kotlin.math.sqrt(numero.toDouble())
}

fun main() {
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt()

    val raizQuadrada = calcularRaizQuadrada(numero)
    println("A raiz quadrada de $numero é $raizQuadrada")
}
