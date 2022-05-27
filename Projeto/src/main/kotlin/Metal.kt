class Metal(reciclaveis: Boolean, noscivo:Boolean): Materiais(reciclaveis, noscivo) {

    override var reciclavel: String = ("Latas de alumínio, Latas de aço, Tampas, Ferragens, " +
            "Canos, Molduras de quadros Tampinhas de garrafas,Enlatados, Panelas SEM cabo," +
            " Ferragens, Arames, Chapas, Canos, Pregos, Cobre, Embalagem de marmitex, Papel " +
            "alumínio limpo, Aerossóis\n")
    override var nreciclavel: String = ("Clipes, Grampos, Esponja de aço, Latas de inseticidas," +
            " Latas de verniz, Latas de solventes químicos \n")

    fun calculadorametal() {
        println(
            "Escolha o tipo de metal:" +
                    "\n1 - Cobre" +
                    "\n2 - Alumínio" +
                    "\n3 - Ferro"
        )
        var opc = readln().toInt()

        when (opc) {
            1 -> {
                var precokg = 20.00
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda de $kg KG é R$$total\n" +
                        "O KG desse material é em média R$$precokg.")

            }
            2 -> {
                var precokg = 5.00
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total."+
                "O KG desse material é em média R$$precokg.")
            }
            3 -> {
                var precokg = 1.00

                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.\n\n"+
                "O KG desse material é em média R$$precokg ")
            }
        }
    }
}