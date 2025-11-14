package aula_07_nulos

fun main() {

    var a: String? = null

    // Elvis operator -> Result sempre deverá ser String e nunca nula
    // Se a esquerda for Nulo o Elvis a direita apresenta um valor para ser o valor do resultado
    val result: String = a ?: "1"

    println(result)

    var b: Int = -1

    // Operador de chamada segura -> O a é null operador proteje de nulos "Recebe o valor de nulo como resposta
    // Usado o Operador Elvis juntamente
    println("Operador Elvis")
    b = a?.toInt() ?: 0

    println(b)

    // Utilizando o !! chama Operador Not-null onde força o acesso mesmo se for Null
    // Caso faça errado ele retornará uma erro de Exception

    if(a != null){
        println("Operador de chamada segura")
        println(a!!.toInt())
    }

    // as Operador chamado para fazer conversões de dados safe-cast
    println("Operador safe cast")
    val c = a as? Int // as é o operador para chamados o cast -> Conversões de dados

    println(c)

    // Metodo let contra nulos
    b?.let {

        println("Operador let contra nulos")
        println(it)

    }

}
