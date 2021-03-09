package Exercicios2.exercicio3.Exercicios.ex7;

public class Produto {

    private String nomeProduto;
    private Double preco;
    private int qtdEstoque;

    public Produto(String descricao, Double preco, int qtdEstoque) {
        this.nomeProduto = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    Double getPreco() {
        return this.preco;
    }

    public void getProduto() {
        System.out.println("Produto: " + this.nomeProduto + "\nPreço: R$" + this.preco + "\nQuantidade estoque:  " + this.qtdEstoque);
    }
}
