// Ler um número e dizer se é par ou ímpar.

package revisao

fun main() {
    print("Digite um número: ")
    val numero = readln().toIntOrNull()

    if (numero == null) {
        println("Valor inválido. Digite apenas números inteiros.")
    } else if (numero % 2 == 0) {
        println("O número $numero é PAR.")
    } else {
        println("O número $numero é ÍMPAR.")
    }
}
