package Exercicios2.exercicio1;

import Cliente.CategoriaCNH;
import Cliente.Cliente;

public class Locadora {

    private String nomeLocadora;
    private Carro[] carros = new Carro[100]; // no máximo 100 carros
    private int qtdCarros = 0;
    private Cliente[] clientes = new Cliente[100]; //no máximo 100 clientes
    private int qtdClientes = 0;

    public Locadora(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    void addCarro(String marca, String modelo, String cor, int qtdPortas, int ano, int kmRodados) {
        Carro carro = new Carro(marca, modelo, cor, qtdPortas, ano, kmRodados); //criando instancia da classe Carro
        
        carros[qtdCarros] = carro;
        qtdCarros++;
    }

    int getQtdCarros() {
        return qtdCarros;
    }

    void getListaCarros() {
        System.out.println("LISTA DE VEÍCULOS PARA ALUGUEL");
        for (int i = 0; i < qtdCarros; i++) {
            System.out.println(carros[i].getCarro());
            System.out.println("-------------------");
        }
    }

    void addCliente(String clienteNome, String endereco, CategoriaCNH categoriaCNH) {
        Cliente cliente = new Cliente(clienteNome, endereco, categoriaCNH); //criando instancia da classe Cliente
        
        clientes[qtdClientes] = cliente;
        qtdClientes++;
    }

    int getQtdClientes() {
        return qtdClientes;
    }

    void getListaClientes() {
        System.out.println("LISTA DE CLIENTES");
        for (int i = 0; i < qtdClientes; i++) {
            System.out.println(clientes[i].getCliente());
            System.out.println("-------------------");
        }
    }

}
