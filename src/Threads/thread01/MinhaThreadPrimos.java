package thread01;

import java.util.ArrayList;
import java.util.List;

import calculadora.Calculadora;

public class MinhaThreadPrimos implements Runnable {

	private String nome;
	private List<Integer> nums;
	private List<Integer> numeros = new ArrayList<Integer>();
	private int qtd = 0;
	
	//UMA INSTANCIA STATIC DA CALCULADORA PARA A THREAD
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadPrimos(String nome, List<Integer> array) {
		this.nome = nome;
		this.nums = array;
		new Thread(this, nome).start();
		
		//Thread t = new Thread(this, nome);
		//t.start();
	}

	@Override
	public void run() {
		
		System.out.println(this.nome + "iniciada");
		
		int contador;
		int numero = 0;
		for (Integer i : nums) {
			contador = 0;

		       for (int u = 1; u <= i; u++) {
				if (i % u == 0) {
					contador++;
					numero = u;
				}
			}
			
			if (contador == 2) {
				qtd++;  
			}		
		}
		System.out.println("Existem " + qtd + " números primos");
		System.out.println(this.nome + "terminada");	
	}
}