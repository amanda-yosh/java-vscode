package thread02;

public class CounterUser {

	public static void main(String[] args) {

		Counter c = new Counter();
		
		ThreadCounter tci = new ThreadCounter("#01 Thread Increment", c, 0);
		ThreadCounter tcd = new ThreadCounter("#02 Thread Decrement", c, 1);
		
		try {
			tci.t.join();
			tcd.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}