package Exercicios.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private int numCartas = 52;

    List<Carta> baralho = Carta.novoBaralho();

    public void baralhoEmbaralhado() {
        Collections.shuffle(baralho);
    }

    public void baralhoOrdenada() {
        Collections.sort(baralho);
    }
}
