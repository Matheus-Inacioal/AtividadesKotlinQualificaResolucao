fun main(){
    println("Digite seu nome:")
    val nome = readLine()
    println("Digite seu peso:")
    val peso = readLine()!!.toDouble()
    println("Digite sua altura:")
    val altura = readLine()!!.toDouble()
    
    val resultcalcIMC = calcIMC(peso, altura)
    val tableIMC = tableIMC(resultcalcIMC)
    println("Olá $nome, o seu IMC hoje é: $resultcalcIMC\n$tableIMC")
    
}

fun calcIMC(peso: Double, altura: Double): Double{
        
        val imc = peso / (altura * altura)
        return imc 
}

fun tableIMC (imc: Double): String{
    
    return if (imc < 16){
        "magreza grave, procure imediatamente um Medico para que possa montar um plano de tratamento imediato."
    } else if (imc < 16.9){
        "magreza moderada, procure um Medico ou Nutricionista, para que possa iniciar um plano de tratamento para melhorar tua saude."
    } else if (imc < 18.4){
        "magreza leve, procure um Nutricionista, para que seja criado um plano alimentar o mais rapido possivel."
    } else if (imc < 24.9){
        "Parabens, você está com o seu peso ideal, continue com uma vida saudavel, sempre fazendo acompanhamento medico, nutricional e atividades fisicas!"
    } else if (imc < 29.9){
        "Sobrepeso, procure um nutricionista e um profissional de educação fisica para que possa iniciar um plano educação alimentar e atividades fisicas para obter o peso ideal."
    } else if (imc < 34.9){
        "Obesidade Grau 1, procure um nutricionista e um profissional de educação fisica para que possa iniciar um plano educação alimentar e atividades fisicas para obter o peso ideal o mais breve possivel."    
    } else if (imc < 39.9){
        "Obesidade Grau 2, procure um nutricionista e um profissional de educação fisica para que possa iniciar um plano educação alimentar e atividades fisicas para obter o peso ideal imediatamente."
    } else {
        "Obesidade Grau 3, procure um medico e/ou nutricionista e/ou profissinal de educação fisica para que seja criado um tratamento para que você possa reestabelecer uma vida saudavel atingindo seus objetivos."
    } 
}