package implementationofthread;

public class simplethread extends Thread {


	public void run() {
		System.out.println("main thread running");
	}
	public static void main(String[] args) {
		simplethread st = new simplethread();
		st.start();
	}
}
