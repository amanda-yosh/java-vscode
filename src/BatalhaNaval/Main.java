package BatalhaNaval;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BatalhaNaval bn = new BatalhaNaval();
        bn.imprimeBatalha();
        while (!bn.ehFimDeJogo()) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um número: ");
            String palpite = teclado.next();
            bn.verificaPalpite(Integer.parseInt(palpite));
            bn.imprimeBatalha();
        }

        //agora com o ArrayList o simbolo modifica de X para ~, caso eu coloque o mesmo valor duas vezes
    }
}
