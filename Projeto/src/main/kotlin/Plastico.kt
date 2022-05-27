class Plastico(
    reciclaveis: Boolean,
    noscivo:Boolean
): Materiais(reciclaveis, noscivo) {

    override var reciclável: String =
        ("Copos plásticos, sacos/sacolas, frascos de produtos, embalagens Pet, canos de PVC, tubo de caneta (Sem a tinta), tampas, embalagens tipo Tupperware, embalagens de produto de limpeza, potes de alimentos, frascos, utilidades domésticas, peças de brinquedos, engradados de bebidas e baldes")
    override var nreciclável: String = ("Cabos de panela, Tomadas, Isopor, Adesivos, Espuma, Teclados de computador, Embalagens de salgadinho e Bolacha (embalagens plásticas metalizadas), Acrílicos")

    fun calculadoraPlastico() {

        println("Digite o peso de cada tipo de papel (em Kg):")
        println("1 - Tetrapak")
        var tetrapak = readln().toDouble()
        println("2 - Filme")
        var filme = readln().toDouble()
        println("3 - PET")
        var pet = readln().toDouble()
        println("3 - PVC")
        var pvc = readln().toDouble()

        val precoPesoTetrapak = 0.07
        val precoPesoFilme = 0.32
        val precoPesoPet = 0.4
        val precoPesoPVC = 0.4


        var finalTetrapak = precoPesoTetrapak * tetrapak
        var finalFilme = precoPesoFilme * filme
        var finalPet = precoPesoPet * pet
        var finalPVC = precoPesoPVC * pvc

        var valorFinal = finalTetrapak + finalFilme + finalPet + finalPVC


        println("O valor total de papelão é de: R$$finalTetrapak")
        println("O valor total de papel branco é de: R$$finalFilme")
        println("O valor total de papel misto é de: R$$finalPet")
        println("O valor total de papel misto é de: R$$finalPVC")
        println("O valor total final é de: R$$valorFinal")
    }
}