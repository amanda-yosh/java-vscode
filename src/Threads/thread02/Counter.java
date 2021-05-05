package thread02;

public class Counter {
	
	private int count = 0;

	synchronized void increment() {
		
		while (count >= 3) {
			System.out.println("Esperando count ser menor que 3");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count++;
		System.out.println("O contador count sofreu um incremento e seu novo valor é " + count);
		notify();
	}
	
	synchronized void decrement() {
		
		while (count <= 0) {
			System.out.println("Esperando count ser maior que 0");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		count--;
		System.out.println("O contador count sofreu um decremento e seu novo valor é " + count);
		notify();
	}

}