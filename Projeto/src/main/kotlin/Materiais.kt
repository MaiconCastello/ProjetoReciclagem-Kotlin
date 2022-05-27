class Materiais (
    var reciclaveis: Boolean,
    var noscivo: Boolean,

        ){
    val reciclável = listOf<String>("papel","Vidro","plástico","metal")


    fun exibirLista(reciclaveis: Boolean){
        reciclável.forEach(){
            println(it)
        }
    }

    fun parse(str: String): List<String> {

        val list: List<String> = listOf(*str.split(", ").toTypedArray())

        return list        // [A, B, C, D]
    }



}