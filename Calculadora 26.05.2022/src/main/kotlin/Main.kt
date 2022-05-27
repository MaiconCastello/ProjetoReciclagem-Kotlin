import java.lang.Math.pow
import kotlin.math.*
fun main() {

    println("Me saude, humano miserável!!! Caso contrario me mande PARE e eu fecho esse processo :(")
    var lolo = readln().toString()

    while (lolo!="PARE") {

        println("!!!!!!!!!!!!!!!!Bem-vindo(a) a SUPER CALCULADORA MASTER BLASTER!!!!!!!!!!!!!!!!!!!!!!!!")
        println("\nEscolha a operação matemática que deseja fazer, e digite seu número respectivo: ")
        println("1- Soma\n2- Multiplicação\n3- Divisão\n4- Subtração\n5- Potência\n6- Raiz quadrada\n")
        var cod = readln().toInt()

        when (cod) {
            1 -> {
                println("Insira valor no primeiro número: ")
                var n1 = readln().toDouble()
                println("Insira valor no segundo número: ")
                var n2 = readln().toDouble()
                Calculadora.soma(n1, n2) }

            2 -> {
                println("Insira valor no primeiro número: ")
                var n1 = readln().toDouble()
                println("Insira valor no segundo número: ")
                var n2 = readln().toDouble()
                Calculadora.multi(n1, n2) }

            3 -> {
                println("Insira valor no primeiro número: ")
                var n1 = readln().toDouble()
                println("Insira valor no segundo número: ")
                var n2 = readln().toDouble()
                Calculadora.divisao(n1, n2) }

            4 -> {
                println("Insira valor no primeiro número: ")
                var n1 = readln().toDouble()
                println("Insira valor no segundo número: ")
                var n2 = readln().toDouble()
                Calculadora.sub(n1, n2) }

            5 -> {
                println("Insira valor do número: ")
                var n1 = readln().toDouble()
                Calculadora.pot(n1) }


            6 -> {
                println("Insira valor do número: ")
                var n1 = readln().toDouble()
                Calculadora.raiz(n1) }

            else -> println("Operação inválida.") }
        println("\nMe saude, humano miserável!!! Caso contrario me mande PARE e eu fecho esse processo :(")
        lolo = readln().toString()
    }
}