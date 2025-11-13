// Ter uma variável String? e imprimir um texto padrão se for nula usando ?:.

package revisao

fun main() {
    print("Digite seu nome: ")
    val nome: String = readln()

    print("Digite um apelido (ou deixe vazio): ")
    val entradaApelido = readln()

    // Se o usuário digitou vazio, consideramos como null
    val apelido: String? = if (entradaApelido.isBlank()) null else entradaApelido

    // Se apelido for null -> usa "Sem apelido"
    val textoExibicao = apelido ?: "Sem apelido"

    println("Nome: $nome")
    println("Apelido: $textoExibicao")
}
