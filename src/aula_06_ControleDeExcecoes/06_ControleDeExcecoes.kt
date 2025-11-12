package aula_06_ControleDeExcecoes

fun main() {

    // try / catch
    var x = 1

    try {
        // Código deseja a ser executado pelo programa
        x = 1 / 0
        println(x)
    }catch (e: Exception){
        // Caso uma exceção ao bloco try aconteça
        x = 3
        println(x)
    } finally {
        // Ao final do try ouu catch
        x = 4
        println(x)
    }


}