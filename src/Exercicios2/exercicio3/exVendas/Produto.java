package Exercicios2.exercicio3.exVendas;

public class Produto {

    private String descricao;
    private float preco;

    Produto(String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    float getPreco() {
        return this.preco;
    }
    void setPreco(float novoPreco) {
        this.preco = novoPreco;
    }

    String getDescricao() {
        return this.descricao;
    }

    void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }
}
