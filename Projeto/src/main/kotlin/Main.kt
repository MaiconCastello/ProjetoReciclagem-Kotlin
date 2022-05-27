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
            1 ->{
                menu =0
                var reciclavel: Boolean = true
                while (menu<1 || menu>2){
                    println("Escolha uma opção válida:")
                    print("1 → RECICLÁVEL\n" +
                            "2 → NÃO RECICLÁVEL\n")
                    menu = readln().toInt()
                }
                when(menu){
                    1 -> {
                        reciclavel = true
                    }

                    2 -> {
                        reciclavel = false
                    }
                }
                println("Escolha uma opção:")
                print("1 → PAPEL\n" +
                        "2 → PLÁSTICO\n" +
                        "3 → METAL\n" +
                        "4 → VIDRO\n")
                menu = readln().toInt()
                when(menu){
                    1 -> {
                        val papel = Papel(reciclavel,true)
                        papel.exibirLista(papel.reciclavel)
                    }
                    2 -> {
                        val plastico = Plastico(reciclavel,true)
                        plastico.exibirLista(plastico.reciclavel)
                    }
                    3 -> {
                        val metal = Metal(reciclavel,true)
                        metal.exibirLista(metal.reciclavel)
                    }
                    4 -> {
                        val vidro = Vidro(reciclavel,true)
                        vidro.exibirLista(vidro.reciclavel)
                    }

                }
                }
            2 ->{}
            3 ->{}
            4 -> break
        }
    }




}