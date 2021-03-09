package Exercicios2.exercicio3.Exercicios.ex1;

public class Contato {
    
    private String nome;
    private String endereco;
    private String telefone;

    public Contato(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void getContato() {
        System.out.println("Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nTelefone: " + this.telefone);
    }

    public void deleteContato() {
        this.nome = null;
        this.endereco = null;
        this.telefone = null;
    }
}