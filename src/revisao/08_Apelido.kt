// Ler um possível apelido (String?) e imprimir o tamanho usando ?. e ?: se for nulo/vazio.
// Utilizando length
// val nome: String? = null

package revisao

fun main() {
    println("Digite seu apelido")
    val entradaApelido: String? = readlnOrNull()

    println(entradaApelido?.length) //SAFE CALL -> Só imprime se não for null, caso seja null ele imprime o null

    // isNullOrBlank faz duas checagens ao mesmo tempo: 1- Se for null retorna / true 2- Se for string em branco, retorna true
    val apelido: String? = if (entradaApelido.isNullOrBlank()) null else entradaApelido

    val mensagem: String = apelido
        ?.length
        ?.toString()
        ?: "Apelido não pode ser contado"
     
}
/*

fun main() {
    println("Digite seu apelido")
    val entradaApelido: String? = readlnOrNull()  // pode ser nulo

    // Se for nulo, vazio ou só espaços, tratamos como null
    val apelido: String? = if (entradaApelido.isNullOrBlank()) null else entradaApelido

    // Usando ?. e ?: para obter o tamanho ou uma mensagem padrão
    val mensagem: String = apelido
        ?.length          // se não for nulo, pega o length (Int?)
        ?.toString()      // transforma o Int? em String?
        ?: "Apelido não pode ser contado"  // se for nulo em qualquer ponto, cai aqui

    println(mensagem)
}

}*/

/*
    Aquela parte do código que contem o if -> Equivale a isso
        val x: Tipo
        if (condicao) {
            x = valorSeVerdadeiro
        } else {
            x = valorSeFalso
        }

*/