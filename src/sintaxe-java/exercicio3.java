/* Imprima a soma de 1 até 999 */

public class exercicio3 {
    public static void main(String[] args) {

        int soma = 0; // só funcionou depois que inicializei a variavel, ou seja, soma = 0, porque?

        for (int i = 1; i <= 999; i++) {
            soma = soma + i;
        }

        System.out.println("A soma de 1 até 999 é: " + soma);
    }
}
