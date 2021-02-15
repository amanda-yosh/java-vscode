import java.util.Scanner;

/* O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa com os funcionários pedindo que cada um avaliasse a qualidade das refeições informando uma nota de 0 a 100. O setor quer saber o percentual de funcionários que considera as refeições péssimas (nota entre 0 e 25), ruins (nota acima de 25 e até 50), boas (nota acima de 50 e até 75) e ótimas (acima de 75 até 100).
Escreva um programa que leia as notas informadas e imprima o percentual de funcionários que votou em cada faixa. A entrada de dados deve terminar quando for lido um valor que não pertença a nenhum dos intervalos acima. */

public class exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota = 0;
        int pessima = 0;
        int ruim = 0;
        int boa = 0;
        int otima = 0;

        while (nota >= 0 & nota <= 100) {
            System.out.println("Avalie a refeição:");
            nota = teclado.nextInt();

            if (nota >= 0 & nota <= 25) {
                pessima++;
            }
            if (nota > 25 & nota <= 50) {
                ruim++;
            }
            if (nota > 50 & nota <= 75) {
                boa++;
            }
            if (nota > 75 & nota <= 100) {
                otima++;
            }
        }
        System.out.println("Avaliações pessimas: "+ pessima +". Avaliações ruins: "+ ruim +". Avaliações boas: "+ boa +". Avaliações ótimas: "+ otima +".");
    }
}
