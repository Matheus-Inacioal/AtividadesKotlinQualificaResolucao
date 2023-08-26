fun main() {
    val maxUsuarios = 1000
    val usuarios = mutableListOf<Map<String, Any>>()
    var proximoId = 1

    while (true) {
        println("\nMenu:")
        println("1. Cadastrar usuário")
        println("2. Editar usuário")
        println("3. Excluir usuário")
        println("4. Buscar usuário por email")
        println("5. Imprimir todos os usuários cadastrados")
        println("0. Sair")

        print("Escolha uma opção: ")
        when (readLine()?.toIntOrNull()) {
            1 -> cadastrarUsuario(usuarios, proximoId++, maxUsuarios)
            2 -> editarUsuario(usuarios)
            3 -> excluirUsuario(usuarios)
            4 -> buscarUsuarioPorEmail(usuarios)
            5 -> imprimirUsuarios(usuarios)
            0 -> break
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}

fun cadastrarUsuario(usuarios: MutableList<Map<String, Any>>, id: Int, maxUsuarios: Int) {
    if (usuarios.size >= maxUsuarios) {
        println("Limite de usuários alcançado.")
        return
    }

    val nome = getInput("Nome completo: ")
    val email = getEmailInput("Email: ")
    val sexo = getInput("Sexo (Feminino/Masculino/Indiferente): ")
    val endereco = getInput("Endereço: ")
    val altura = getInputDouble("Altura (entre 1 e 2 m): ", 1.0, 2.0)
    val vacina = getInputInt("Vacina (1 para sim, 0 para não): ", 0, 1)

    val usuario = mapOf(
        "id" to id,
        "nome" to nome,
        "email" to email,
        "sexo" to sexo,
        "endereco" to endereco,
        "altura" to altura,
        "vacina" to vacina
    )

    usuarios.add(usuario)
    println("Usuário cadastrado com sucesso.")
}

fun editarUsuario(usuarios: MutableList<Map<String, Any>>) {
    val email = getEmailInput("Digite o email do usuário a ser editado: ")
    val usuario = usuarios.find { it["email"] == email }

    if (usuario != null) {
        println("Usuário encontrado:")
        imprimirUsuario(usuario)

        val nome = getInput("Novo nome (ou enter para manter): ")
        if (nome.isNotEmpty()) {
            usuario["nome"] = nome
        }

        val sexo = getInput("Novo sexo (Feminino/Masculino/Indiferente) (ou enter para manter): ")
        if (sexo.isNotEmpty()) {
            usuario["sexo"] = sexo
        }

        val endereco = getInput("Novo endereço (ou enter para manter): ")
        if (endereco.isNotEmpty()) {
            usuario["endereco"] = endereco
        }

        val altura = getInputDouble("Nova altura (ou enter para manter): ", 1.0, 2.0)
        if (altura != -1.0) {
            usuario["altura"] = altura
        }

        val vacina = getInputInt("Nova vacina (1 para sim, 0 para não) (ou enter para manter): ", 0, 1)
        if (vacina != -1) {
            usuario["vacina"] = vacina
        }

        println("Usuário editado com sucesso.")
    } else {
        println("Usuário não encontrado.")
    }
}

fun excluirUsuario(usuarios: MutableList<Map<String, Any>>) {
    val email = getEmailInput("Digite o email do usuário a ser excluído: ")
    val usuario = usuarios.find { it["email"] == email }

    if (usuario != null) {
        usuarios.remove(usuario)
        println("Usuário excluído com sucesso.")
    } else {
        println("Usuário não encontrado.")
    }
}

fun buscarUsuarioPorEmail(usuarios: List<Map<String, Any>>) {
    val email = getEmailInput("Digite o email do usuário a ser buscado: ")
    val usuario = usuarios.find { it["email"] == email }

    if (usuario != null) {
        println("Usuário encontrado:")
        imprimirUsuario(usuario)
    } else {
        println("Usuário não encontrado.")
    }
}

fun imprimirUsuarios(usuarios: List<Map<String, Any>>) {
    println("\nUsuários cadastrados:")
    for (usuario in usuarios) {
        imprimirUsuario(usuario)
    }
}

fun imprimirUsuario(usuario: Map<String, Any>) {
    println("ID: ${usuario["id"]}")
    println("Nome: ${usuario["nome"]}")
    println("Email: ${usuario["email"]}")
    println("Sexo: ${usuario["sexo"]}")
    println("Endereço: ${usuario["endereco"]}")
    println("Altura: ${usuario["altura"]} m")
    println("Vacina: ${if (usuario["vacina"] == 1) "Sim" else "Não"}")
    println()
}

fun getInput(prompt: String): String {
    print(prompt)
    return readLine() ?: ""
}

fun getEmailInput(prompt: String): String {
    while (true) {
        val email = getInput(prompt)
        if (email.contains("@")) {
            return email
        } else {
            println("Email inválido. Deve conter o caractere '@'.")
        }
    }
}

fun getInputDouble(prompt: String, min: Double, max: Double): Double {
    while (true) {
        val input = getInput(prompt)
        val number = input.toDoubleOrNull()
        if (number != null && number >= min && number <= max) {
            return number
        } else {
            println("Valor inválido. Deve ser um número entre $min e $max.")
        }
    }
}

fun getInputInt(prompt: String, min: Int, max: Int): Int {
    while (true) {
        val input = getInput(prompt)
        val number = input.toIntOrNull()
        if (number != null && number >= min && number <= max) {
            return number
        } else {
            println("Valor inválido. Deve ser um número entre $min e $max.")
        }
    }
}
