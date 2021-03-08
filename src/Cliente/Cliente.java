package Cliente;

public class Cliente {
    
    private String nome;
    private String sobrenome;
    private String cpf;
    private String endereco;
    private CategoriaCNH CategoriaCNH;

    //construtor
    public Cliente(String cliente, String sobrenome, String cpf, String endereco, CategoriaCNH categoria) {
        this.nome = cliente;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.CategoriaCNH = categoria;
    }
    
    //sobrecarga de construtor
    //para o exemplo de carros
    public Cliente(String cliente, String endereco, CategoriaCNH categoriaCNH) {
        this.nome = cliente;
        this.endereco = endereco;
        this.CategoriaCNH = categoriaCNH;
    }

    //para o exemplo de vendas
    public Cliente(String cliente, String endereco) {
        this.nome = cliente;
        this.endereco = endereco;
    }

    public String getCliente() {
        return ("Nome: " + this.nome + "\nEndereço:" + this.endereco + "\nCategoria CNH: " + this.CategoriaCNH);
    }
}