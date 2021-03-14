package Exercicios3.ex4;

public class Circulo extends Dimensoes {
    
    private Double areaCirculo = Math.PI * Math.pow(getA(), 2);

    public Circulo(Double a) {
        super(a);
    }

    public void imprimir() {
        System.out.printf("Círculo: %.3f%n", areaCirculo);
    }
}
