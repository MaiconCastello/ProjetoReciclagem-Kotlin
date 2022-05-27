class Plastico(
    reciclaveis: Boolean,
    noscivo:Boolean
): Materiais(reciclaveis, noscivo) {

    override var reciclavel: String =
        ("Copos plásticos, sacos/sacolas, frascos de produtos, embalagens Pet, canos de PVC, tubo de caneta (Sem a tinta), tampas, embalagens tipo Tupperware, embalagens de produto de limpeza, potes de alimentos, frascos, utilidades domésticas, peças de brinquedos, engradados de bebidas e baldes\n")
    override var nreciclavel: String = ("Cabos de panela, Tomadas, Isopor, Adesivos, Espuma, Teclados de computador, Embalagens de salgadinho e Bolacha (embalagens plásticas metalizadas), Acrílicos\n")

    fun calculadoraPlastico() {
        println("-----TABELA DE PREÇOS-----")
        println("-----Tetrapak: R$00.07-----")
        println("-----Filme:    R$00.32-----")
        println("-----PET:      R$00.40-----")
        println("-----PVC:      R$00.40-----")


        println(
            "Escolha o tipo de metal:" +
                    "\n1 - Tetrapak" +
                    "\n2 - Filme" +
                    "\n3 - PET" +
                    "\n4 - PVC"
        )
        var opc = readln().toInt()

        when (opc) {
            1 -> {
                var precokg = 0.07
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.")

            }
            2 -> {
                var precokg = 0.32
                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.")
            }
            3 -> {
                var precokg = 0.4

                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.\n\n")
            }

            4 -> {
                var precokg = 0.4

                println("Digite o valor em KG a ser vendido: ")
                var kg = readln().toDouble()
                var total = precokg * kg
                println("\nO valor médio de venda é R$$total.\n\n")
            }
        }
        print("Aperte enter para continuar...")
        readln()
        println()
    }
}