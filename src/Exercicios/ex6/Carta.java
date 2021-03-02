package Exercicios.ex6;

import java.util.ArrayList;
import java.util.List;

public class Carta {

    private Naipe naipe;
    private Valor valor;

    private Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe naipe() {
        return naipe;
    }

    public Valor valor() {
        return valor;
    }

    public String toString() {
        return valor + " de " + naipe;
    }

    private static final List<Carta> baralho = new ArrayList<Carta>();

    //baralho
    static {
        for (Naipe naipe : Naipe.values())
            for (Valor valor : Valor.values())
                baralho.add(new Carta(naipe, valor));
    }

    public static ArrayList<Carta> novoBaralho() {
        return new ArrayList<Carta>(baralho); // Retorna copia do baralho
    }
}
