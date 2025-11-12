// Ler um número de 1 a 7 e mostrar o dia da semana usando when.

package revisao

fun main() {
    print("Insira um número de 1 a 7: ")
    val numero = readln().toInt()

    val semana = when(numero){
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> println("Número invalido")

    }
    println("Opção: $semana")
}