import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.lang.Math.pow
import kotlin.math.*


internal class CalculadoraTest{
    @Test
    fun somaTest(){
        assertEquals(11.0, Calculadora.soma(5.0,6.0))
    }
    @Test
    fun multiTest(){
        assertEquals(8.0, Calculadora.multi(2.0,4.0))
    }
    @Test
    fun divisaoTest() {
        assertEquals(3.0, Calculadora.divisao(21.0,7.0))
    }
    @Test
    fun subTest() {
        assertEquals(3.0, Calculadora.sub(6.0,3.0))
    }
    @Test
    fun potTest() {
        assertEquals(16.0, Calculadora.pot(4.0))
    }
    @Test
    fun raizTest() {
        assertEquals(3.0, Calculadora.raiz(9.0))
    }

}