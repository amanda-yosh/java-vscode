package Exercicios2.exercicio3.Exercicios.ex7;

public class Item {

    Produto produto;
    int quantidade;

    Double getSubTotal() {
        return (this.quantidade * produto.getPreco());
    }
}
