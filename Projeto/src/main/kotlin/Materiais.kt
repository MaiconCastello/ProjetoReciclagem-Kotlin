abstract class Materiais (
    var reciclaveis: Boolean,
    var noscivo: Boolean,

        ) {
    open var reciclável: String = ("Bla-Bla, arroz, feijão")
    open var nreciclável: String = ("papel, bluble, abublé")
    open

    fun exibirLista(reciclaveis: Boolean) {
        if (reciclaveis) {
            var listr: List<String> = listOf(*reciclável.split(", ").toTypedArray())
            listr.forEach(){
                println(it)
            }

        }else{
            var listnr: List<String> = listOf(*nreciclável.split(", ").toTypedArray())
            listnr.forEach() {
                println(it)
            }

        }
    }
}

