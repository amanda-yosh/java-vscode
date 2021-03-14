package Exercicios3.ex4;

public class Dimensoes {

    private Double A;
    private Double B;

    public Dimensoes(Double a) {
        this.A = a;
    }

    public Dimensoes(Double a, Double b) {
        this.A = a;
        this.B = b;
    }
    
    public Double getA() {
        return this.A;
    }

    public Double getB() {
        return this.B;
    }
}
