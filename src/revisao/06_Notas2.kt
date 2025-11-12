// Ler uma nota (0 a 10) e atribuir conceito A, B, C ou D usando when com faixas.

package revisao

fun main() {
    print("Insira sua nota: ")
    var notaInserida = readln().toDouble()

    val nota = when (notaInserida) {
        in 9.0..10.0 -> "A"
        in 7.0..8.9 -> "B"
        in 5.0..6.9 -> "C"
        in 3.0..4.9 -> "D"
        in 0.0..2.9 -> "E"
        else -> "Nota inválida"
    }
    println("Sua nota: $notaInserida é tem a nota: $nota")
}