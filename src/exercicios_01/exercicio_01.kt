/*
Controle de Exceções (try / catch)

Conversão segura para Int
Ler um texto do usuário.
Tentar converter para Int.
Se der erro, capturar a exceção e mostrar “Valor inválido”.
 */

package exercicios_01

fun main() {
    print("Digite algo: ")
    var texto = readln()

    try {
        texto.toInt()
        println(texto)

    } catch (e: NumberFormatException){
        // A utilização do NumberFormatException faz com que selecione apenas o tipo de número inválido
        // O catch está filtrado apenas para número!
        println("Você não digitou um número!")
    }finally {

    }

}