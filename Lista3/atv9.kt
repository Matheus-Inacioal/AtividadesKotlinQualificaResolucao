 // Este programa solicita ao usuário que insira o peso e a altura, calcula o IMC e imprime a categoria correspondente usando condicionais if, else if e else.

fun main() {
    // Solicita ao usuário para inserir o peso em kg
    println("Digite o seu peso em kg:")
    val peso = readLine()!!.toDouble() // Lê o peso inserido pelo usuário e converte para Double

    // Solicita ao usuário para inserir a altura em metros
    println("Digite a sua altura em metros:")
    val altura = readLine()!!.toDouble() // Lê a altura inserida pelo usuário e converte para Double

    // Calcula o IMC (peso / altura²)
    val imc = peso / (altura * altura)

    // Determina a categoria do IMC usando condicionais if, else if e else
    val categoria: String
    if (imc < 18.5) {
        categoria = "abaixo do peso"
    } else if (imc < 24.9) {
        categoria = "no peso normal"
    } else if (imc < 29.9) {
        categoria = "com sobrepeso"
    } else if (imc < 34.9) {
        categoria = "obeso"
    } else {
        categoria = "muito obeso"
    }

    // Imprime o IMC e a categoria correspondente
    println("Seu IMC é %.2f, o que significa que você está $categoria.".format(imc))
}
