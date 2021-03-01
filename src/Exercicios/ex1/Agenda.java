package Exercicios.ex1;

public class Agenda {
    
    private int size;
    private int quantidade = 0;

    private Contato[] vetorContatos; 

    public void tamanhoAgenda(int tamanhoAgenda) {
        this.vetorContatos = new Contato[tamanhoAgenda];
        this.size = tamanhoAgenda;
    }

    public void adicionarContato(Contato pessoa) {
        if (this.quantidade < this.size){
            this.vetorContatos[this.quantidade] = pessoa.setContato;
            this.quantidade++;
        }
        else {
            System.out.println("Agenda cheia");
        }
    }

    public Contato[] listagem() {
        // for (int i = 0; i < this.vetorContatos.length; i++){
        //     System.out.println(this.vetorContatos[i]);
        // }
        return this.vetorContatos;
    }

    public void removerContato(Contato pessoa) {
        pessoa.delContato();
    }
}