// Ler 3 notas, calcular a média e dizer se o aluno está aprovado, recuperação ou reprovado.

package revisao

fun main() {
    print("Digite sua nota de matematica: ")
    val notaMatematica = readln().toDouble()


    print("Digite sua nota de Português: ")
    val notaPortugues = readln().toDouble()

    print("Digite sua nota de Biologia: ")
    val notaBiologia = readln().toDouble()

    val media = (notaMatematica + notaPortugues + notaBiologia) / 3.0

    println("A soma da média: %.2f".format(media))

    val status = when {
        media >= 7.0 -> "aprovado"
        media >= 5.0 -> "recuperação"
        else -> "reprovado"
    }
    print("\nStatus: $status")
}