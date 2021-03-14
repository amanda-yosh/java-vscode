package Exercicios3.ex3;

public class Main {
    public static void main(String[] args) {
        Pessoa fred = new Pessoa("Fred", 50);
        Pessoa si = new Pessoa("Simmone", 50);
        Pessoa eu = new Pessoa("Amanda", 23, fred, si);

        eu.imprimir();
    }
}
