// Usar um String? chamado email e, se não for nulo/vazio, imprimir “Enviando email para ...” usando let.

package revisao

fun main() {
    // Leitura de e-mail ok....
    println("Digite o e-mail")

    val email: String? = readln() // O readIn sempre espera o usuário digitar algo e nunca retornar um null

        // takeIf devolve a própria condição se o valor for true -> null se a condição for falsa
        // Lembrando que o it é a String que veio do readIn
        .takeIf { it.isNotBlank() } // Se for vazio/branco -> Vira null

    // Safe call aplicado com o ?. / Se o e-mail for null ele NÃO entra no let
    // Se o e-mail for null -> Entra no let
    email?.let {
        println("Enviando email para $it") // it É o próprio valor do e-mail
    }

}