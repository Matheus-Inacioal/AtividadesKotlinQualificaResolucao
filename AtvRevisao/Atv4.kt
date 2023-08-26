fun main() {
    val tarefas = mutableListOf<Tarefa>()

    while (true) {
        println("\nMenu:")
        println("1. Adicionar Tarefa")
        println("2. Marcar Tarefa como Concluída")
        println("3. Listar Tarefas Pendentes")
        println("0. Sair")

        print("Escolha uma opção: ")
        when (readLine()?.toIntOrNull()) {
            1 -> adicionarTarefa(tarefas)
            2 -> marcarTarefaConcluida(tarefas)
            3 -> listarTarefasPendentes(tarefas)
            0 -> break
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}

data class Tarefa(val descricao: String, var concluida: Boolean = false)

fun adicionarTarefa(tarefas: MutableList<Tarefa>) {
    val descricao = getInput("Digite a descrição da tarefa: ")
    tarefas.add(Tarefa(descricao))
    println("Tarefa adicionada com sucesso.")
}

fun marcarTarefaConcluida(tarefas: MutableList<Tarefa>) {
    val indice = escolherTarefa(tarefas, "Marcar como concluída")
    if (indice != -1) {
        tarefas[indice].concluida = true
        println("Tarefa marcada como concluída.")
    } else {
        println("Tarefa não encontrada.")
    }
}

fun listarTarefasPendentes(tarefas: List<Tarefa>) {
    println("\nTarefas Pendentes:")
    var count = 0
    for (tarefa in tarefas) {
        if (!tarefa.concluida) {
            count++
            println("$count. ${tarefa.descricao}")
        }
    }
    if (count == 0) {
        println("Nenhuma tarefa pendente.")
    }
}

fun escolherTarefa(tarefas: List<Tarefa>, acao: String): Int {
    listarTodasTarefas(tarefas)

    if (tarefas.isEmpty()) {
        return -1
    }

    print("Digite o número da tarefa que deseja $acao: ")
    val numeroTarefa = readLine()?.toIntOrNull()
    if (numeroTarefa != null && numeroTarefa in 1..tarefas.size) {
        return numeroTarefa - 1
    }

    return -1
}

fun listarTodasTarefas(tarefas: List<Tarefa>) {
    println("\nLista de Tarefas:")
    var count = 0
    for (tarefa in tarefas) {
        count++
        val status = if (tarefa.concluida) "[Concluída]" else "[Pendente]"
        println("$count. $status ${tarefa.descricao}")
    }
    if (count == 0) {
        println("Nenhuma tarefa cadastrada.")
    }
}

fun getInput(mensagem: String): String {
    print(mensagem)
    return readLine() ?: ""
}
