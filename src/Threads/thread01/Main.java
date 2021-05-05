package thread01;

import java.util.List;
import java.util.Scanner;

import calculadora.MinhaThreadSoma;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Quantos primos há entre 0 e ...?");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		
		MinhaThreadArray t1 = new MinhaThreadArray("#1 Thread ", n);
		
		List<Integer> array = t1.getArray();
		
		MinhaThreadPrimos t2 = new MinhaThreadPrimos("#2 Thread ", array);

	}

}
