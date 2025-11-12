// Ler 3 notas, calcular a média e dizer se o aluno está aprovado, recuperação ou reprovado.

package revisao

fun main() {
    print("Digite sua nota de matematica: ")
    var notaMatematica = readln().toInt()

    print("Digite sua nota de Português: ")
    var notaPortugues = readln().toInt()

    print("Digite sua nota de Biologia: ")
    var notaBiologia = readln().toInt()

    var somaTotal = (notaMatematica + notaPortugues + notaBiologia) / 3

    println("Média das notas: $somaTotal")
}