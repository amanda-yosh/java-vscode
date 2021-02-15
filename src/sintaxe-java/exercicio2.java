import java.util.Scanner;

/* Escreva um programa que efetue a leitura de três valores reais R, S e T, imprimindo qual deles é o maior */
public class exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float R, S, T, saida;

        System.out.println("Digite tres valores:");
        R = teclado.nextFloat();
        S = teclado.nextFloat();
        T = teclado.nextFloat();

        saida = Math.max(R, S);
        saida = Math.max(saida, T);

        System.out.println("O maior valor é " + saida);

    }
}