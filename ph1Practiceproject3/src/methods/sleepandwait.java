package methods;

public class sleepandwait {
	private static Object close = new Object();

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("Thread " + Thread.currentThread().getName() + " is woken after sleeping for 1 second");

		synchronized (close) {
			close.wait(1000);
			System.out.println("Object " + close + " is woken after " + " waiting for 1 second");
		}
	}
}
