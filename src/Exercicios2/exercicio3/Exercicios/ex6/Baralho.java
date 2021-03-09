package Exercicios2.exercicio3.Exercicios.ex6;

import java.util.Collections;

public class Baralho {

    private Carta[] cartasBaralho = new Carta[53];

    public void baralhoEmbaralhado() {
        Collections.shuffle(cartasBaralho);
    }

    public void baralhoOrdenada() {
        Collections.sort(cartasBaralho);
    }
}
