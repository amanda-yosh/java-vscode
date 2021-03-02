package Exercicios.ex6;

public enum Naipe {
    PAUS("PAUS"),
    OUROS("OUROS"),
    COPAS("COPAS"),
    ESPADAS("ESPADAS");

    private String naipe;

    Naipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNaipe() {
        return naipe;
    }
}