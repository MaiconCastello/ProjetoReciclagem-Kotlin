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


}