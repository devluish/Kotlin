/*
Divisão com tratamento

Ler dois números inteiros.
Tentar dividir o primeiro pelo segundo.
Se o segundo número for 0, tratar o erro e mostrar uma mensagem adequada (sem deixar o programa quebrar).
*/

package exercicios_01

fun main() {

    println("Digite um número!")
    val numero1 = readln().toInt()

    println("Digite outro número")
    val numero2 = readln().toInt()

    try {
        val divisao = numero1 / numero2
        println("Resultado: $divisao")

    } catch (e: ArithmeticException){
        println("Não é possível dividir por zero!")
    } finally {

    }
}

