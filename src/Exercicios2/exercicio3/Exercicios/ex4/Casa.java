package Exercicios2.exercicio3.Exercicios.ex4;

import Exercicios2.exercicio3.Exercicios.ex3.Porta;

public class Casa {

    private String cor;
    private static int qtdPortas = 1;
    public Porta[] portas = new Porta[qtdPortas];
    private int qtdPortasAbertas;

    public Casa(String cor) {
        this.cor = cor;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    void addPorta(String cor, double altura, double comprimento, double espessura) {
        //this.portas[qtdPortas] = new Porta(cor, altura, comprimento, espessura);
        Porta porta = new Porta(cor, altura, comprimento, espessura); //criando instancia da classe porta
        portas[qtdPortas] = porta;
        qtdPortas++;
    }

    public void quantasPortasEstaoAbertas() {
        for (int i = 1; i <= qtdPortas; i++) {
            if (portas[i].getEstado() == true) {
                this.qtdPortasAbertas++;
            }
        }
        System.out.println("Quantidade de portas abertas: " + this.qtdPortasAbertas);
        this.qtdPortasAbertas = 0;
    }

    public void getCor() {
        System.out.println(this.cor);
    }
}
