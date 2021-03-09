package Exercicios2.exercicio3.Exercicios.ex2;

public class Pessoa {

    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario() {
        this.idade++;
    }

    public void getInformacoes() {
        System.out.println(this.nome + " tem " + this.idade + " anos.");
    }
}
