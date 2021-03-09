package Exercicios2.exercicio3.Exercicios.ex1;

public class Agenda {
    
    private String nomeAgenda;
    private String dono;
    private Contato[] listaContatos = new Contato[100]; // no máximo 100 contatos
    private int qtdContatos = 0;

    public Agenda(String nome, String dono) {
        this.nomeAgenda = nome;
        this.dono = dono;
    }

    public void addContato(String nome, String endereco, String telefone) {
        Contato contato = new Contato(nome, endereco, telefone);
        
        listaContatos[qtdContatos] = contato;
        qtdContatos++;
    }

    public void getContato() {
        System.out.println(this.nomeAgenda + "\nPertence a: " + dono);
        for (int i = 0; i < qtdContatos; i++) {
            listaContatos[i].getContato();
            System.out.println("-------------------");
        }
    }

    public int getQtdContatos() {
        return qtdContatos;
    }

    public void removerContato(int i) {
        listaContatos[i].deleteContato();
    }
}