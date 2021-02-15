import java.util.Scanner;

class oiMundo { // nome do arquivo deve coincidir com o nome da classe do programa
    
    public static void main(String[] args) { // função principal, assinatura
        Scanner teclado = new Scanner(System.in); // recebendo .in
        int idade;
        String nome;

        System.out.println("Digite a sua idade:"); // saindo .out
        idade = teclado.nextInt();

        System.out.println("Digite o seu nome:");
        nome = teclado.next();


        System.out.println("Oi mundo! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

// Java é case sensitive