/* Escreva um programa que recebe como parâmetro um número inteiro n. A função deve ler n valores do teclado e retornar quantos destes valores são negativos. */

import java.util.Scanner; // importação da classe Scanner

public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // criação da variável que permite acessar a classe Scanner

        int n, valor;
        int neg = 0;
    
        System.out.println("Digite o parametro n:");
        n = teclado.nextInt();
    
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o valor "+ i +":");
            valor = teclado.nextInt();
            if (valor < 0) {
                neg = neg + 1;
            }
        }
        System.out.println("Foram digitados "+ neg +" valores negativos.");
    }
}