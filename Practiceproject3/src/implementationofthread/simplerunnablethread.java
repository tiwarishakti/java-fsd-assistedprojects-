package implementationofthread;

public  class simplerunnablethread implements Runnable {

	public static int c = 0;

	public simplerunnablethread() {
	}

	public void run() {
		while (simplerunnablethread.c <= 10) {
			try {
				System.out.println("expl Thread: " + (++simplerunnablethread.c));
				Thread.sleep(1000);
			} catch (InterruptedException iex) {
				System.out.println("exception in thread: " + iex.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting main Thread....");
		simplerunnablethread mrt = new simplerunnablethread();
		Thread t = new Thread(mrt);
		t.start();
		while (simplerunnablethread.c <= 10) {
			try {
				System.out.println("main thread: " + (++simplerunnablethread.c));
				Thread.sleep(1000);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}

		System.out.println("End of Main Thread...");
	}

}
