class Papel(
    reciclaveis: Boolean,
    noscivo:Boolean
    ): Materiais(reciclaveis, noscivo) {

    override var reciclavel: String =
        ("Jornais, Revistas, Livros, Folhas de caderno, Papelão, Envelopes, Cartazes, Caixa de pizza, Cartolinas, Papel cartão, Embalagens longa vida (Tetrapak, como leite ou sucos), Impressos em geral.")
    override var nreciclavel: String = ("Papel higiênico, Papéis plastificados, Papéis engordurados, Etiquetas adesivas, Papel carbono, Papel celofane, Guardanapos, Bitucas de cigarros, Fotografias, Fita crepe, Papel toalha, Metalizados, Plastificados")


    fun calculadoraPapel() {
        println("-----TABELA DE PREÇOS-----")
        println("-----Papelão: R$0.08-----")
        println("-----Branco:  R$0.14-----")
        println("-----Misto:   R$0.06-----")

        println(
            "Escolha o tipo de papel:" +
                    "\n1 - Papelão" +
                    "\n2 - Branco" +
                    "\n3 - Misto"
        )
        var opc = readln().toInt()

        when(opc){
            1 ->{
                val precokg = 0.08
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.")
            }
            2 ->{
                val precokg = 0.14
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.")
            }
            3 ->{
                val precokg = 0.06
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.")
            }

        }
    }
}