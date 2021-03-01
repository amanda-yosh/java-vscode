package Exercicios.ex4;

import Exercicios.ex3.Porta;

public class Casa {

    private String cor;
    private int qtdPortas;

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void criarPorta(Porta porta) {
        porta = new Porta(); //quando chamarem o método criarPorta, um objeto Porta será instanciado
        this.qtdPortas++;
    }

    public int quantasPortasEstaoAbertas() {
        return this.qtdPortas;
    }
}
