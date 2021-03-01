package Exercicios.ex6;

public class Carta {

    public enum Valor {
        AS, VALETE, DAMA, REI, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE
    }

    public enum Naipe {
        PAUS, OUROS, COPAS, ESPADAS
    }

    private final Valor valor;
    private final Naipe naipe;

    private Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }
    
    // private String naipe;
    // private String valor;

    // public void setNaipe(String naipe) {
    //     this.naipe = naipe;
    // }

    // public String getNaipe() {
    //     return this.naipe;
    // }

    // public void setValor(String valor) {
    //     this.valor = valor;
    // }

    // public String getValor() {
    //     return this.valor;
    // }
}
