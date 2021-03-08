package Exercicios2.exercicio3.exVendas;

import Cliente.Cliente;

public class Pedido {
    Cliente cliente;
    Item[] itens = new Item[100]; //no máximo 100 itens
    int qtdDeItens = 0;

    Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    
    float getTotal() {
        float total = 0;
        for (int i=0; i<qtdDeItens; i++) {
            total += itens[i].getSubTotal();
        }
        return total;
    }

    void addItem(Produto produto, int quantidade) {
        Item item = new Item(); //criando instancia da classe item
        item.produto = produto;
        item.quantidade = quantidade;
        itens[qtdDeItens] = item;
        qtdDeItens++;
    }
}
