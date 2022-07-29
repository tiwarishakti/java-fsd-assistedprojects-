
public class methoddemo {

	public int multipynumbers(int a, int b) {
		int z = a * b;
		return z;
	}

	public static void main(String[] args) {
		methoddemo b = new methoddemo();
		int ans = b.multipynumbers(10, 3);
		System.out.println("Multiplication is:" + ans);

	}

}
