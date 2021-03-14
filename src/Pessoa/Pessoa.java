package Pessoa;

public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;

    // public Pessoa(String nome, String endereco, String telefone, String email) {
    //     this.nome = nome;
    //     this.endereco = endereco;
    //     this.telefone = telefone;
    //     this.email = email;
    // }

    public void atualizarContato(String endereco, String telefone, String email) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimePessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
    }
}
