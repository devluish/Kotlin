// Criar um menu (1-Cadastrar, 2-Listar, 3-Sair) e usar when pra tratar a opção.

package revisao

import kotlin.concurrent.thread

fun menu() {
    println("----------------------")
    println("Bem-vindo ao Menu\n")
    println("1- Cadastrar")
    println("2- Listar")
    println("3- Sair")
    println("----------------------")

    var opcaoInserida = readln().toInt()

    when (opcaoInserida) {
        1 -> cadastrar()
        2 -> listar()
        3 -> sair()
        else -> ("Opção invalida")
    }
}

fun cadastrar(){
    println("Cadastro de usuário")
}

fun listar(){
    println("Listar usuários")
}

fun sair(){
    println("Saindo do sistema....")
}
fun main(){
    menu()
}