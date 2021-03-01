package Exercicios.ex2;

public class criarPessoa {

    private String nome;
    private int idade;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario() {
        this.idade++;
    }

    public void show() {
        System.out.println(this.nome + " tem " + this.idade + " anos.");
    }
}
