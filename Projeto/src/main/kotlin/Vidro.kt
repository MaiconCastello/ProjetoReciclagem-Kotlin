class Vidro(reciclaveis: Boolean, noscivo:Boolean): Materiais(reciclaveis, noscivo) {

    override var reciclavel: String = ("Potes de conservas, Embalagens, Frascos de remédios vazios, Copos, Garrafas\n")
    override var nreciclavel: String = ("Espelhos, Boxes temperados, Louças, Óculos, Cerâmicas, Porcelanas, Pirex," +
            "Tubos de TV,  Monitores, Para-brisa de carros\n")


    fun calculadoraVrido() {
        println("-----TABELA DE PREÇOS-----")
        println("-----Âmbar:        R$0.42-----")
        println("-----Transparente: R$05.00-----")
        println("-----Verde:        R$01.00-----")


        println(
            "Escolha o tipo de vidro:" +
                    "\n1 - Âmbar" +
                    "\n2 - Transparente" +
                    "\n3 - Verde"
        )
        var opc = readln().toInt()

        when (opc) {
            1 -> {
                var precokg = 0.42
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = kg * precokg

                println("\nO valor médio de venda é R$$total.")
            }
            2 -> {
                var precokg = 0.62
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = kg * precokg

                println("\nO valor médio de venda é R$$total.")
            }
            3 -> {
                var precokg = 0.28
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = kg * precokg

                println("\nO valor médio de venda é R$$total.")
            }
        }

    }
}