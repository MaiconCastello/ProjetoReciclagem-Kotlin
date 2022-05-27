abstract class Materiais (
    var reciclaveis: Boolean,
    var noscivo: Boolean,

        ) {
    open var reciclavel: String = ("")
    open var nreciclavel: String = ("")
    open

    fun exibirLista(reciclaveis: Boolean) {
        if (reciclaveis) {
            var listr: List<String> = listOf(*reciclavel.split(", ").toTypedArray())
            println("Os materiais recicláveis são:")
            listr.forEach(){
                println(it)
            }

        }else{
            var listnr: List<String> = listOf(*nreciclavel.split(", ").toTypedArray())
            println("Os materiais não recicláveis são:")
            listnr.forEach() {
                println(it)
            }

        }
        print("Aperte enter para continuar...")
        readln()
        println()
    }




}

