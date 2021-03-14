package Exercicios3.ex4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        Double a = teclado.nextDouble();
        System.out.println("Digite o valor B: ");
        Double b = teclado.nextDouble();

        //polimorfismo estático em tempo de execução (?)
        Quadrado quadrado = new Quadrado(a);
        quadrado.imprimir();
        Retangulo retangulo = new Retangulo(a, b);
        retangulo.imprimir();
        Triangulo triangulo = new Triangulo(a, b);
        triangulo.imprimir();
        Circulo circulo = new Circulo(a);
        circulo.imprimir();
    
        teclado.close();
    }
}
