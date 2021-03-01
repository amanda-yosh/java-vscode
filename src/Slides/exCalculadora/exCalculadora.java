package Slides.exCalculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class exCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option = -1;
        
        while(option != 0){
            System.out.println("Que operação deseja fazer?");
            NumberFormat formatter = new DecimalFormat("#0.00");     
            System.out.println(formatter.format(4.0));
            System.out.println("MEMORIA: "+ formatter.format(Calculadora.getMemoria()));
            System.out.println("(1) Somar");
            System.out.println("(2) Subtrair");
            System.out.println("(3) Multiplicar");
            System.out.println("(4) Dividir");
            System.out.println("(5) Limpar memória");
            System.out.println("(6) Sair do programa");
            option = teclado.nextInt();
            System.out.print("Digite o operando: ");
            double value = teclado.nextInt();

    
            switch (option) {
                case 1:
                    Calculadora.somar(value);
                    break;
                case 2:
                    Calculadora.subtrair(value);
                    break;
                case 3:
                    Calculadora.multiplicar(value);
                    break;
                case 4:
                    Calculadora.dividir(value);
                    break;
                case 5:
                    Calculadora.clear();
                    break;
                case 6:
                    option=0;
                    break;
            }
        }
    }
}

