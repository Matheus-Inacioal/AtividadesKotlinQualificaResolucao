//Tabuada

// Função que recebe um número inteiro e retorna a sua tabuada, de 1 a 10
fun tabuada(numero: Int): List<Int> {
    val tabuada = mutableListOf<Int>()
    for (i in 1..10) {
        tabuada.add(numero * i)
    }
    return tabuada
}

fun main() {
    println("Digite um número inteiro para calcular a tabuada:")
    val numero = readLine()!!.toInt()

    val resultadoTabuada = tabuada(numero)
    println("Tabuada de $numero:")
    for (i in 1..10) {
        println("$numero x $i = ${resultadoTabuada[i - 1]}")
    }
}
