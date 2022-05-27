
import kotlin.math.*
class Calculadora {
    companion object{

        fun soma(n1: Double, n2: Double): Double{
            println("\nSeu resultado é: ")
            println(n1+n2)
            return n1+n2
        }

        fun multi(n1: Double, n2: Double): Double {
            println("\nSeu resultado é: ")
            println(n1*n2)
            return (n1)*(n2) }

        fun divisao(n1: Double, n2: Double): Double {
            println("\nSeu resultado é: ")
            println(n1/n2)
            return n1/n2 }

        fun sub(n1: Double, n2: Double): Double {
            println("\nSeu resultado é: ")
            println(n1-n2)
            return n1-n2 }

        fun pot(n1: Double): Double {
            println("\nSeu resultado é: ")
            println(n1.pow(2))
            return n1.pow(2) }

        fun raiz(n1: Double): Double {
            println("\nSeu resultado é: ")
            println(sqrt(n1))
            return sqrt(n1)

        }

    }

}