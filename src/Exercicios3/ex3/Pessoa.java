package Exercicios3.ex3;

//3. Faça um programa para representar a árvore genealógica de uma família. Para tal, crie uma classe Pessoa que permita indicar, além de nome e idade, o pai e a mãe. Tenha em mente que pai e mãe também são do tipo Pessoa. 

public class Pessoa {
    
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    Pessoa() {}

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    Pessoa(String nome, int idade, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return this.nome;
    }

    public void imprimir() {
        System.out.println("ARVORE GENEALÓGICA");
        System.out.println("|" + pai.getNome() + "| |" + mae.getNome() + "|");
        System.out.println(nome + " de " + idade);
    }
}
