package Exercicios3.ex4;

public class Quadrado extends Dimensoes {

    private Double areaQuadrado = Math.pow(getA(), 2);
    
    public Quadrado(Double a) {
        super(a);
    }

    public Double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void imprimir() {
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
    }
}
