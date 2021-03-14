package Exercicios3.ex9;

import java.util.ArrayList;

import Exercicios3.ex1.ConversaoDeUnidadeDeArea;

public class SomaDasAreas {

    private static ArrayList<ConversaoDeUnidadeDeArea> soma = new ArrayList<ConversaoDeUnidadeDeArea>();
    
    //vai somar as areas independentemente da unidade, vai virar uma bagunça
    public static Double somaDasAreas() {
        Double total = 0.0;
        for (ConversaoDeUnidadeDeArea area : soma) {
            total += area.getArea();
        }
        return total;
    }
}
