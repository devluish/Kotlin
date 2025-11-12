// Ler uma idade e dizer se é maior ou menor de idade.
package revisao

fun main() {
    println("Digite sua idade")
    val idade = readln().toInt()

    if (idade >= 18){
        println("A idade:$idade é maior")
    } else{
        println("A idade:$idade é menor")
    }
}