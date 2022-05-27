abstract class Materiais (
    var reciclaveis: Boolean,
    var noscivo: Boolean,

        ) {
    open val reciclável = listOf<String>("papel", "Vidro", "plástico", "metal")
    open val nreciclável = listOf<String>("papel", "Vidro", "plástico", "metal")

    fun exibirLista(reciclaveis: Boolean) {
        if (reciclaveis) {
            reciclável.forEach() {
                println(it)
            }
        } else {
            nreciclável.forEach() {
                println(it)
            }
        }
    }
}

