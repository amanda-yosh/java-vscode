package thread01;

import java.util.ArrayList;
import java.util.List;

import calculadora.Calculadora;

public class MinhaThreadArray implements Runnable {

	private String nome = "Thread Popula Array";
	private int n;
	private List<Integer> numeros = new ArrayList<Integer>();
	
	//UMA INSTANCIA STATIC DA CALCULADORA PARA A THREAD
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadArray(String nome, int n) {
		this.nome = nome;
		this.n = n;
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		
		System.out.println(this.nome + "iniciada");
		
		for(int i = 0; i <= n; i++){
			numeros.add(i);
			System.out.println("Indice " + numeros.get(i) + " populado com " + i);
		}
		
		System.out.println(this.nome + "terminada");
	}
	
	public List<Integer> getArray() {
		return numeros;
	}
}