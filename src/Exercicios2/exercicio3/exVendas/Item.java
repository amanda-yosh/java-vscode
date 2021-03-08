package Exercicios2.exercicio3.exVendas;

public class Item {
    Produto produto;
    int quantidade;

    float getSubTotal() {
        return (this.quantidade * produto.getPreco());
    }
}
