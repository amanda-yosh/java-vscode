import java.util.Scanner;

/* Escreva um programa que recebe um valor N inteiro e que, se N for positivo, retorna o fatorial de N (N!). Se não for possível calcular o fatorial, a função deve imprimir uma mensagem e retornar o valor -1. */

public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int N, num;
        int fatorial = 1;
        N = teclado.nextInt();
        num = N;

        if (N > 0) {
            while (N > 1) {
                fatorial = fatorial * (N);
                N--;
            }
            System.out.println("O fatorial de "+ num +" é "+ fatorial);
        } else {
            System.out.println(-1);
        }
    }
}