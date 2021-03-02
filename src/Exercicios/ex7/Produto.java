package Exercicios.ex7;

public class Produto {

    String nomeProduto;
    double preco;
    int qtdEstoque;

    //construtor
    public Produto() {}
    public Produto(String produto, double preco, int qtdEstoque) {
        this.nomeProduto = produto;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void setProduto(String nome, double preco, int qtd){
        this.nomeProduto = nome;
        this.preco = preco;
        this.qtdEstoque = qtd;
    }

    public void getProduto() {
        System.out.println(this.nomeProduto + ", " + this.preco + ", " + this.qtdEstoque);
    }
}
