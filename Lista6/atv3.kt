 //EncontrarMaior

// Função que recebe dois números inteiros e retorna o maior deles
fun encontrarMaior(numero1: Int, numero2: Int): Int {
    return if (numero1 > numero2) numero1 else numero2
}

fun main() {
    println("Digite o primeiro número inteiro:")
    val numero1 = readLine()!!.toInt()

    println("Digite o segundo número inteiro:")
    val numero2 = readLine()!!.toInt()

    val maior = encontrarMaior(numero1, numero2)
    println("O maior número entre $numero1 e $numero2 é $maior")
}
