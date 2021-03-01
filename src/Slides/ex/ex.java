package Slides.ex;

public class ex {
    public static void main(String[] args) {
        // for	(int	i	=	0;	i	<	100;	i++) {
        //     if (i > 50 && i < 60) {
        //         continue; //obriga a executar o laço antes de ir para a linha do sysout
        //     }
        //     System.out.println(i);
        // }

        int x = 10;
        int div;
        div = x / 0; //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(x);
        System.out.println(div);
    }
}
