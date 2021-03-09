package Exercicios2.exercicio3.Exercicios.ex6;

public enum Naipe {
    PAUS("PAUS"),
    OUROS("OUROS"),
    COPAS("COPAS"),
    ESPADAS("ESPADAS");

    private String naipe;

    private Naipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNaipe() {
        return naipe;
    }
}