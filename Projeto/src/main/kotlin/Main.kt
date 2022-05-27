fun main() {

    println("Bem vinde, selecione uma das opções abaixo:")
    while(true){
        println("MENU" +
                "\n1 → Verificar se um produto é reciclável ou não" +
                "\n2 → Onde Descartar materiais específicos" +
                "\n3 → Calculadora de valores com reciclagem" +
                "\n4 → Sair")
        var menu = readln().toInt()
        when(menu){
            1 ->{val teste = Papel(false,true)
            teste.exibirLista(teste.reciclaveis)}
            2 ->{}
            3 ->{}
            4 -> break
        }
    }



}