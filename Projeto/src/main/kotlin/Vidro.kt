class vidro(reciclaveis: Boolean, noscivo:Boolean): Materiais(reciclaveis, noscivo){

    override var reciclável: String = ("Potes de conservas, Embalagens, Frascos de remédios vazios, Copos, Garrafas\n")
    override var nreciclável: String = ("Espelhos, Boxes temperados, Louças, Óculos, Cerâmicas, Porcelanas, Pirex, " +
                                         "Tubos de TV,  Monitores, Para-brisa de carros ")
}

fun calculadora() {

    println("Escolha o tipo de vidro:"+
            "\n1 - Ambar"+
            "\n2 - Transparente"+
            "\n 3 - Verde")
    var opc = readln().toInt()

    when(opc){
        1-> precokg = x
        2-> precokg = y
        3-> precokg  = z}


}