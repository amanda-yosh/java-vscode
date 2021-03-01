/* Um quadrado mágico é uma matriz quadrada, de valores inteiros, na qual a soma dos elementos de cada linha, a soma dos elementos de cada coluna e a soma dos elementos da diagonal primária e da diagonal secundária são iguais.
Desenvolva um programa que leia do usuário uma matriz quadrada de ordem n e imprima se a matriz é um quadrado mágico ou não.*/

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz quadrada:");
        int ordem;
        ordem = teclado.nextInt();

        //criando vetores
        int [] vetorA = new int [ordem];
        int [] vetorB = new int [ordem];

        //criando a matriz
        int [] [] matrizQuadrada = new int [ordem] [ordem];

        // preenchendo a matriz
        for ( int i = 0; i < vetorA.length; i++) {
            for ( int j = 0; j < vetorB.length; j++) {
                System.out.println(" Digite o valor de i na posição " + i + vetorA[i] + " e j nas posição " + j + vetorB[j]);

                matrizQuadrada [i] [j] = teclado.nextInt();
            }
        }
        
        // soma das diagonais
        int somaDP = 0;
        int somaDS = 0;
            
        // diagonal principal
        for ( int i = 0; i <= vetorA.length; i++) {
            somaDP += matrizQuadrada [i] [i];
        }
        System.out.println("Soma da diagonal principal: "+ somaDP);
            
        // diagonal secundária
        for ( int i = 0; i <= ordem; i++) {
            somaDS += matrizQuadrada [ordem-i] [i];
        }
        System.out.println("Soma da diagonal secundária: "+ somaDS);
        /*   
        // soma das linhas usando vetores
        int vetL[ordem];
        for  ( i = 0; i < ordem; i++) {
                vetL[i] = 0;
                for (j = 0; j < ordem; j++) {
                    vetL[i] += matrizQuadrada [i] [j];
                }
        }
        for ( i = 0; i < ordem; i++) {
            System.out.println("%i ", vetL[i]);
        }
         
        // soma das colunas
        int vetC[n];
        for ( j = 0; j < ordem; j++) {
            vetC[j] = 0;
            for ( i = 0; i < n; i++) {
                vetC[j] += matrizQuadrada [i] [j];
            }
        }
        for ( i = 0; i < ordem; i++) {
            System.out.println("%i ", vetC[i]);
        }

        // verificando a validade da matriz
        int testaL = 1, testaC = 1;
        for ( i = 1; i <  ordem; i++) {
            if (vetL[i] != vetL[i-1]) {
                testaL = 0;
                break;
            } else if (vetC[i] != vetC[i-1]) {
                testaC = 0;
                break;
            }
        }
            
        if (testaL && testaC && somaDP == somaDS && somaDP == vetL[0]) {
            System.out.println("Quadrado magico");
        } else {
            System.out.println("Quadrado nao magico");
        }*/

    }
}
