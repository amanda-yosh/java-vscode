package Exercicios3.ex4;

public class Triangulo extends Dimensoes {

    private Double areaTriangulo = (getA() * getB()) / 2.0;
        
    public Triangulo(Double a, Double b) {
        super(a, b);
    }

    public void imprimir() {
        System.out.printf("Triangulo: %.3f%n", areaTriangulo);
    }
}
