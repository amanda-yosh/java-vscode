## Exercícios - Introdução a POO

    1 - [1 ponto] Faça um programa de agenda telefônica, com as classes Agenda e Contato.

# 2 - [1 ponto] Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) e imprima seu nome e sua idade.

# 3 - [1 ponto] Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método estaAberta para verificar se ela está aberta.

    4 - [1 ponto] Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.

# 5 - [1,5 pontos] Escreva uma classe Televisao sabendo que o estado de uma televisão se caracteriza por estar ligada ou desligada, pelo volume (que está entre 0 e 10), pelo canal (que está entre 0 e 99) e pelo fato de estar em modo silencioso ou não. Crie métodos para ligar/desligar a televisão, mudar o canal (canal específico, canal anterior, próximo canal) e silenciar a televisão. Instancie um objeto dessa classe, utilize seus métodos para mudar de canal, ligar e desligar a TV, silenciar ou dessilenciar a TV e, por último, imprima o estado da TV.

# 6 - [1,5 pontos]Para implementar jogos com cartas, são necessárias classes para representar uma carta individual e também um baralho. Sugira implementações para essas classes, considerando: Cartas - ás, 2 a 9, valete, dama e rei, dos naipes copas, espadas, ouros e paus; Baralho - conjunto de 52 cartas (13 cartas de cada naipe), em ordem ou embaralhado.
    classe Valor;
    classe Naipe;
    classe Carta;
    classe Baralho;

    7 - [1,5 pontos] Identifique e implemente as classes em Java para a seguinte especificação:
    O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada item especifica o produto que o cliente deseja e a respectiva quantidade. Esse pedido pode ser pago em dinheiro, cheque ou cartão.
        classe Produto
            atributos: String nomeProduto; float preco; int qtdEstoque.
        classe Pedido
            atributos: String cliente; Item item; String pagamento.
            método: pagamento = dinheiro, cheque ou cartão.
        classe Item
            atributos: lista de produtos(vetor); int qtdDesejada.

# 8 - [1,5 pontos]Faça uma classe celular em que cada celular contém uma bateria, cada bateria é caracterizada pela capacidade de carga (medida em unidades u inteiras) e pelo nível de carga. Com o seu celular você pode enviar mensagens de texto e fazer ligações mas, obviamente, ambas as funções afetam o nível da bateria: uma mensagem de texto consome uma unidade de carga e uma chamada consome uma unidade de carga a cada 5 segundos. Também é possível saber o nível de carga do celular. Implemente as classes com todos os métodos que julgar apropriados para simular objetos reais e, em seguida, instancie os objetos e faça alguns testes.
    Melhoras:
    - mensagens entre celulares;