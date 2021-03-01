package Exercicios.exPessoa.ex4;

import Exercicios.ex2.criarPessoa;

public class Programa {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa();

        minhaCasa.pintar("Verde");

        minhaCasa.criarPorta(porta1);
        minhaCasa.criarPorta(porta2);
        minhaCasa.criarPorta(porta3);

        porta1.abrir();
        porta2.fechar();

        minhaCasa.quantasPortasEstaoAbertas();
    }
}
