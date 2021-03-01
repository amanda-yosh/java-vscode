package Exercicios.ex2;

public class exPessoa {
    public static void main(String[] args){
        criarPessoa eu = new criarPessoa();

        eu.setNome("Amanda");
        eu.setIdade(23);
        eu.show();

        eu.fazAniversario();
        eu.fazAniversario();
        eu.fazAniversario();

        eu.show();
    }
}
