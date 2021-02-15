/* Faça um programa para, a partir de um valor informado em centavos, indicar a menor quantidade de moedas que representa esse valor */

import java.util.Scanner;

public class moeda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor;
        int atualMoedas;

        System.out.println("Informe o valor em centavos:");
        valor = teclado.nextInt();

        if (valor > 0) {
            atualMoedas = valor/100;
            if ( atualMoedas > 0 ) {
                System.out.println(atualMoedas + "moeda(s) de 1 real");
                valor = valor - (atualMoedas * 100);
            }

            atualMoedas = valor/50;
            if ( atualMoedas > 0 ) {
                System.out.println(atualMoedas + "moeda(s) de 50 centavos");
                valor = valor - (atualMoedas * 50);
            }

            atualMoedas = valor/25;
            if ( atualMoedas > 0 ) {
                System.out.println(atualMoedas + "moeda(s) de 25 centavos");
                valor = valor - (atualMoedas * 25);
            }

            atualMoedas = valor/10;
            if ( atualMoedas > 0 ) {
                System.out.println(atualMoedas + "moeda(s) de 10 centavos");
                valor = valor - (atualMoedas * 10);
            }

            atualMoedas = valor/5;
            if ( atualMoedas > 0 ) {
                System.out.println(atualMoedas + "moeda(s) de 5 centavos");
                valor = valor - (atualMoedas * 5);
            }

            atualMoedas = valor;
            if ( atualMoedas > 0 ) {
                System.out.println(atualMoedas + "moeda(s) de 1 centavo");
            }
        } else {
            System.out.println("Valor impróprio.");
        }
        
    }
}
