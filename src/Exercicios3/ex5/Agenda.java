package Exercicios3.ex5;

import java.util.ArrayList;

public class Agenda {
    
    private static ArrayList<PessoaFisica> listaFisica = new ArrayList<PessoaFisica>();
    private static ArrayList<PessoaJuridica> listaJuridica = new ArrayList<PessoaJuridica>();

    public Agenda() {}

    //métodos get
    public static ArrayList<PessoaFisica> getListaPessoaFisica() {
        return listaFisica;
    }

    public static ArrayList<PessoaJuridica> getListaPessoaJuridica() {
        return listaJuridica;
    }

    //adiciona um objeto na lista
    public static void adicionar(PessoaFisica pessoa) {
        listaFisica.add(pessoa);
    }

    public static void adicionar(PessoaJuridica pessoa) {
        listaJuridica.add(pessoa);
    }

    //lista os dados de todos os objetos da lista
    public static void listar() {
        int i = 1;
        for (PessoaFisica pessoa1 : listaFisica) {
            System.out.println("\n======= CADASTRO No " + (i++) + "=======");
            pessoa1.imprimir();
        }
        for (PessoaJuridica pessoa2 : listaJuridica) {
            System.out.println("\n======= CADASTRO No " + (i++) + "=======");
            pessoa2.imprimir();
        }
    }

    //pesquisar por CPF ou CNPJ
    static public void pesquisar(String CPFouCNPJ) {
        for (PessoaFisica pessoa1 : listaFisica) {
            if (pessoa1.getCPFouCNPJ().equalsIgnoreCase(CPFouCNPJ)) {
                System.out.println("\n======= CADASTRO ENCONTRADO =======");
                pessoa1.imprimir();
            }
        }
        for (PessoaJuridica pessoa2 : listaJuridica) {
            if (pessoa2.getCPFouCNPJ().equalsIgnoreCase(CPFouCNPJ)) {
                System.out.println("\n======= CADASTRO ENCONTRADO =======");
                pessoa2.imprimir();
            }
        }
    }

    public static void main(String[] args) {

        PessoaFisica pessoa1 = new PessoaFisica("Amália", "111.111.111-22", "Rua A", "01/02");
        PessoaFisica pessoa2 = new PessoaFisica("Juca", "222.222.222-22", "Rua B", "20/12");
        PessoaFisica pessoa3 = new PessoaFisica("Antonio", "333.333.333-22", "Rua C", "07/06");

        PessoaJuridica pessoa4 = new PessoaJuridica("ONG Gatos", "00033344422", "Ao lado do beco", 30000.0);
        PessoaJuridica pessoa5 = new PessoaJuridica("Banco do Amor", "22233344422", "Rua SS", 120000.0);
        PessoaJuridica pessoa6 = new PessoaJuridica("Padaria", "11133344422", "Rua D", 5000.0);

        Agenda.adicionar(pessoa1);
        Agenda.adicionar(pessoa2);
        Agenda.adicionar(pessoa3);
        Agenda.adicionar(pessoa4);
        Agenda.adicionar(pessoa5);
        Agenda.adicionar(pessoa6);

        //polimorfismo
        Agenda.listar();

        Agenda.pesquisar("22233344422");
        
    }
}
