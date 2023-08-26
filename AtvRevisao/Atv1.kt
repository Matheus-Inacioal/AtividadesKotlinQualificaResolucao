fun main() {
    val nome = getInput("Nome: ")
    val peso = getInputDouble("Peso (kg): ")
    val altura = getInputDouble("Altura (m): ")

    val imc = calcularIMC(peso, altura)
    val interpretacao = obterInterpretacao(imc)

    println("\nResultado para $nome:")
    println("Seu IMC é: $imc")
    println("Interpretação: $interpretacao")
}

fun getInput(mensagem: String): String {
    print(mensagem)
    return readLine() ?: ""
}

fun getInputDouble(mensagem: String): Double {
    while (true) {
        val entrada = getInput(mensagem)
        val numero = entrada.toDoubleOrNull()
        if (numero != null) {
            return numero
        } else {
            println("Valor inválido. Por favor, digite um número válido.")
        }
    }
}

fun calcularIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}

fun obterInterpretacao(imc: Double): String {
    if (imc < 18.5) {
        return "Abaixo do peso. Procure um médico ou nutricionista."
    } else if (imc < 24.9) {
        return "Peso normal. Continue com um estilo de vida saudável!"
    } else if (imc < 29.9) {
        return "Levemente acima do peso. Tente manter uma dieta equilibrada e fazer exercícios."
    } else {
        return "Obeso. Consulte um profissional de saúde para orientações."
    }
}
