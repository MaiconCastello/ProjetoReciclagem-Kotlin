class Vidro(reciclaveis: Boolean, noscivo:Boolean): Materiais(reciclaveis, noscivo){

    override var reciclável: String = ("Potes de conservas, Embalagens, Frascos de remédios vazios, Copos, Garrafas\n")
    override var nreciclável: String = ("Espelhos, Boxes temperados, Louças, Óculos, Cerâmicas, Porcelanas, Pirex, " +
                                         "Tubos de TV,  Monitores, Para-brisa de carros")
}

fun calculadora() {

    println("Escolha o tipo de vidro:"+
            "\n1 - Âmbar"+
            "\n2 - Transparente"+
            "\n3 - Verde" +
            "\n4 - Sair")
    var opc = readln().toInt()

    when(opc){
        1-> { println("Digite quantos kilos de vidro você tem: ")
            var kg = readln().toDouble()
            var ambar = 0.42
            var totalvidro = kg * ambar

            println("Você vai receber o total de R$$totalvidro")
        }
        2-> { println("Digite quantos kilos de vidro você tem: ")
            var kg2 = readln().toDouble()
            var transparente = 0.62
            var totalvidro2 = kg2 * transparente

            println("Você vai receber o total de R$$totalvidro2")
        }
        3->{ println("Digite quantos kilos de vidro você tem: ")
            var kg3 = readln().toDouble()
            var verde = 0.28
            var totalvidro3 = kg3 * verde

            println("Você vai receber o total de R$$totalvidro3")
        }
        4 -> break
    }

}