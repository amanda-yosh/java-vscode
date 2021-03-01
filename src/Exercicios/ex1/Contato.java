package Exercicios.ex1;

public class Contato {
    
    private String nome;
    private String endereco;
    private String telefone;
	public Contato setContato;

    private void setContato(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void getContato() {
        System.out.println(this.nome + ", " + this.endereco + ", " + this.telefone);
    }

    void delContato() {
        this.nome = null;
        this.endereco = null;
        this.telefone = null;
    }

    // public String getNome() {
    //     return this.nome;
    // }
    
    // public String getEndereco() {
    //     return this.endereco;
    // }

    // public String getTelefone() {
    //     return this.telefone;
    // }

    // public void setNome(novo) {
    //     this.nome = novo;
    // }

    // public void setEndereco(novo) {
    //     this.endereco = novo;
    // }

    // public void setTelefone(novo) {
    //     this.telefone = novo;
    // }
}