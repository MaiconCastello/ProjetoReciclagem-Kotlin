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
                        papel.exibirLista(papel.reciclaveis)
                    }

                }
                }
            2 ->{
                print("O que você deseja descartar:\n" +
                        "1 → Pilhas\n" +
                        "2 → Eletrônicos\n" +
                        "3 → Óleo de cozinha")
                menu = readln().toInt()
                when(menu){
                    1 ->{
                        Descarte.pilhas()
                    }
                    2 ->{

                    }
                    3 ->{

                    }
                }
            }
            3 ->{
                println("Insira o tipo:\n"+
                                "1 → PAPEL\n" +
                                "2 → PLÁSTICO\n" +
                                "3 → METAL\n" +
                                "4 → VIDRO\n")
                var faustao = readln().toInt()
                when(faustao){
                    1->
                    {}
                    2->
                    {}
                    3->
                    {
                     val precometal = Metal(true,true)
                        precometal.calculadora2()
                    }
                    4->
                    {}
                }

            }
            4 -> break
        }
    }




}