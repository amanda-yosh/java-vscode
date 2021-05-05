package thread02;

public class ThreadCounter implements Runnable {
	
	Counter counter;
	Thread t;
	private int valor = 0;
	private static final int NUM = 20;
	
	public ThreadCounter(String name, Counter counter, int valor) {
		
		t = new Thread(this, name);
		t.start();
		
		this.valor = valor; //0 para increment, 1 para decrement
		this.counter = counter;
	}

	@Override
	public void run() {
		
		System.out.println(t.getName() + " iniciada");
		
		if (valor == 0) {
			for (int i = 0; i <= NUM; i++) {
				counter.increment();
				try {
					Thread.sleep(randomWithRange(0, 500));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		if (valor == 1) {
			for (int i = 0; i <= NUM; i++) {
				counter.decrement();
				try {
					Thread.sleep(randomWithRange(0, 500));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(t.getName() + " terminada");
	}
	
	public int randomWithRange(int min, int max){
		int range = (max - min) + 1;     
		return (int)((Math.random() * range) + min);
	}
}