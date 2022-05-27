class Papel(
    reciclaveis: Boolean,
    noscivo:Boolean
    ): Materiais(reciclaveis, noscivo) {

    override var reciclavel: String =
        ("Jornais, Revistas, Livros, Folhas de caderno, Papelão, Envelopes, Cartazes, Caixa de pizza, Cartolinas, Papel cartão, Embalagens longa vida (Tetrapak, como leite ou sucos), Impressos em geral.")
    override var nreciclavel: String = ("Papel higiênico, Papéis plastificados, Papéis engordurados, Etiquetas adesivas, Papel carbono, Papel celofane, Guardanapos, Bitucas de cigarros, Fotografias, Fita crepe, Papel toalha, Metalizados, Plastificados")





    fun calculadoraPapel() {

        println("Digite o peso de cada tipo de papel (em Kg):")
        println("1 - Papelão")
        var papelao = readln().toDouble()
        println("2 - Branco")
        var branco = readln().toDouble()
        println("3 - Misto")
        var misto = readln().toDouble()
        val precoPesoPapelao = 0.08
        val precoPesoBranco = 0.14
        val precoPesoMisto = 0.06


        var finalPapelao = precoPesoPapelao * papelao
        var finalBranco = precoPesoBranco * branco
        var finalMisto = precoPesoMisto * misto

        var valorFinal = finalPapelao + finalBranco + finalMisto


        println("O valor total de papelão é de: R$$finalPapelao")
        println("O valor total de papel branco é de: R$$finalBranco")
        println("O valor total de papel misto é de: R$$finalMisto")
        println("O valor total final é de: R$$valorFinal")
    }
}