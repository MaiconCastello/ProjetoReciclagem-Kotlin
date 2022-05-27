class Metal(reciclaveis: Boolean, noscivo:Boolean): Materiais(reciclaveis, noscivo) {

    override var reciclável: String = ("Latas de alumínio, Latas de aço, Tampas, Ferragens, " +
            "Canos, Molduras de quadros Tampinhas de garrafas,Enlatados, Panelas SEM cabo," +
            " Ferragens, Arames, Chapas, Canos, Pregos, Cobre, Embalagem de marmitex, Papel " +
            "alumínio limpo, Aerossóis\n")
    override var nreciclável: String = ("Clipes, Grampos, Esponja de aço, Latas de inseticidas," +
            " Latas de verniz, Latas de solventes químicos \n")
}
