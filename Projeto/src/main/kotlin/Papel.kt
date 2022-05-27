class Papel(reciclaveis: Boolean, noscivo:Boolean): Materiais(reciclaveis, noscivo){

    override val reciclável = listOf<String>("copinho","caderno","embalagens","bla-bla")
    override val nreciclável = listOf<String>("copinho","caderno","embalagens","bla-bla")
}
