package Exercicios3.ex4;

public class Retangulo extends Dimensoes {

    private Double areaRetangulo = getA() * getB();

    public Retangulo(Double a, Double b) {
        super(a, b);
    }

    public void imprimir() {
        System.out.printf("Retangulo: %.3f%n", areaRetangulo);
    }
}
