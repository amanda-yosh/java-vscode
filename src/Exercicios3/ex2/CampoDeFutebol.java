package Exercicios3.ex2;

import Exercicios3.ex1.ConversaoDeUnidadeDeArea;

public class CampoDeFutebol {
    
    //A área de um campo de futebol é de 8.250 metros quadrados
    private static final Double areaCampoFutebol = 8250.0;

    
    public static void main(String[] args) {

        //num metodo static não preciso instanciar um objeto para chama-lo
        System.out.println(ConversaoDeUnidadeDeArea.metroPraPes(areaCampoFutebol) + " pés quadrados.");
        System.out.println(ConversaoDeUnidadeDeArea.pesPraCentimetros(areaCampoFutebol) + " centímetros quadrados.");
        ConversaoDeUnidadeDeArea.centimetroPraMilha(areaCampoFutebol);
        System.out.println(ConversaoDeUnidadeDeArea.milhaPraAcres(areaCampoFutebol) + " acres.");
    }
}
