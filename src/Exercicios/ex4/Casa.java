package Exercicios.ex4;

import Exercicios.ex3.Porta;

public class Casa {

    private String cor;
    private int qtdPortas;
    boolean estaAberta;
    int portasCasa;

    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();

    public Casa(Porta porta1, Porta porta2, Porta porta3) {
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void getCor() {
        System.out.println(this.cor);
    }

    public void quantasPortasEstaoAbertas() {
        for (int i = 1; i <= 3; i++) {
            if (porta1.getEstado() == true) {
                this.qtdPortas++;
            }
            if (porta2.getEstado() == true) {
                this.qtdPortas++;
            }
            if (porta3.getEstado() == true) {
                this.qtdPortas++;
            }
        }
        System.out.println(this.qtdPortas);
        this.qtdPortas = 0;
    }
}
